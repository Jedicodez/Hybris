package de.hybris.myshoestore.core.cookies.dao.impl;

import de.hybris.myshoestore.core.cookies.dao.CookiesDao;
import de.hybris.myshoestore.core.model.CookiesModel;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import org.apache.log4j.Logger;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNull;

public class CustomCookiesDao implements CookiesDao {

    private static final Logger LOG = Logger.getLogger(CustomCookiesDao.class);
    private FlexibleSearchService flexibleSearchService;
    private ModelService modelService;

    @Override
    public List<CookiesModel> getCookiesDetails() {
        LOG.info("##############    CustomCookiesDao, get details    ##############");
        final String query = "SELECT {" + CookiesModel.PK + "} FROM {" + CookiesModel._TYPECODE + "}";
        FlexibleSearchQuery searchQuery = new FlexibleSearchQuery(query.toString());
        final SearchResult searchResult = flexibleSearchService.search(searchQuery);
        return searchResult.getResult();
    }

    @Override
    public List<CookiesModel> getSpecificCookiesDetails(final Integer pkgId) {
        LOG.info("##############    CustomCookiesDao, get specific    ##############");
        final Map<String, Object> params = new HashMap<String, Object>();
        final String query = "SELECT {pk} FROM {Cookies} WHERE {pkgId}=?pkgId";
        params.put("pkgId", pkgId);
        final FlexibleSearchQuery searchQuery = new FlexibleSearchQuery(query.toString());
        searchQuery.addQueryParameters(params);
        final SearchResult searchResult = flexibleSearchService.search(searchQuery);
        return searchResult.getResult() == null ? Collections.emptyList() : searchResult.getResult();    }

    @Override
    public void createCookies(CookiesModel cookiesModel) {
        LOG.info("########  CustomCookiesDao    #########");
        getModelService().save(cookiesModel);
    }

    @Override
    public void removeCookies(List<CookiesModel> cookies) {
        LOG.info("##### CustomCookiesDao ######");
        validateParameterNotNull(cookies, "Cookies model cannot be null");
        getModelService().removeAll(cookies);
    }

    @Override
    public void replaceCookies(CookiesModel cookies, final Integer pkgId) {
        LOG.info("##### CustomCookiesDao ######");
        validateParameterNotNull(cookies, "Cookies model cannot be null, please enter cookies data");
        getModelService().removeAll(getSpecificCookiesDetails(pkgId));
        getModelService().save(cookies);
    }

    public void updateCookiesMRP(final Integer pkgId, final Integer MRP) {
        LOG.info("##### CustomCookiesDao, update MRP ######");
        validateParameterNotNull(MRP, "Price cannot be null");
        for (CookiesModel cookies : getSpecificCookiesDetails(pkgId)) {
            if (cookies.getPkgId().equals(pkgId)) {
                getModelService().setAttributeValue(cookies, "MRP", MRP);
                getModelService().save(cookies);
                getModelService().refresh(cookies);
            }
        }
    }

    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }

    public FlexibleSearchService getFlexibleSearchService() {
        return flexibleSearchService;
    }

    public void setFlexibleSearchService(final FlexibleSearchService
                                                 flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }
}
