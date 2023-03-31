package de.hybris.myshoestore.facades.cookies.impl;

import de.hybris.myshoestore.core.cookies.CookiesService;
import de.hybris.myshoestore.core.model.CookiesModel;
import de.hybris.myshoestore.facades.CookiesData;
import de.hybris.myshoestore.facades.cookies.CookiesFacade;
import de.hybris.myshoestore.facades.populators.CookiesReverseDataPopulator;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.model.ModelService;
import org.apache.log4j.Logger;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

public class CustomCookiesFacade implements CookiesFacade {

    private CookiesService cookiesService;
    private ModelService modelService;
    private CookiesReverseDataPopulator cookiesReverseDataPopulator;
    @Resource(name = "cookiesDataConverter")
    private Converter<CookiesModel, CookiesData> cookiesDataConverter;
    private static final Logger LOG = Logger.getLogger(CustomCookiesFacade.class);

    @Override
    public List<CookiesData> getCookiesDetails() {
        LOG.info("######### CustomCookiesFacade, get cookies #############");
        final List<CookiesData> cookies = new ArrayList<CookiesData>();
        final List<CookiesModel> model = cookiesService.getCookiesDetails();
        final List<CookiesData> cookiesData = cookiesDataConverter.convertAll(model);
        cookies.addAll(cookiesData);
        return cookies;
    }

    @Override
    public List<CookiesData> getSpecificCookiesDetails(Integer pkgId) {
        LOG.info("######### CustomCookiesFacade, specific #############");
        final List<CookiesData> cookies = new ArrayList<CookiesData>();
        final List<CookiesModel> model = cookiesService.getSpecificCookiesDetails(pkgId);
        final List<CookiesData> cookiesData = cookiesDataConverter.convertAll(model);
        cookies.addAll(cookiesData);
        return cookies;
    }

    @Override
    public void createCookies(CookiesData cookiesData) {
        LOG.info("######### CustomCookiesFacade, Create #############");
        final CookiesModel cookiesModel = getModelService().create(CookiesModel.class);
        getCookiesReverseDataPopulator().populate(cookiesData, cookiesModel);
        getCookiesService().createCookies(cookiesModel);
    }

    @Override
    public void removeCookies(Integer pkgId) {
        LOG.info("######### CustomCookiesFacade, remove #############");
        getCookiesService().removeCookies(pkgId);
    }

    @Override
    public void replaceCookies(CookiesData cookiesData, Integer pkgId) {
        LOG.info("######### CustomCookiesFacade, replace #############");
        final CookiesModel cookiesModel = getModelService().create(CookiesModel.class);
        getCookiesReverseDataPopulator().populate(cookiesData, cookiesModel);
        getCookiesService().replaceCookies(cookiesModel, pkgId);
    }

    @Override
    public void updateCookiesMRP(final Integer pkgId, final Integer MRP) {
        LOG.info("######### CustomCookiesFacade, update MRP #############");
        getCookiesService().updateCookiesMRP(pkgId, MRP);

    }

    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }

    public CookiesService getCookiesService() {
        return cookiesService;
    }

    public void setCookiesService(CookiesService cookiesService) {
        this.cookiesService = cookiesService;
    }

    public CookiesReverseDataPopulator getCookiesReverseDataPopulator() {
        return cookiesReverseDataPopulator;
    }

    public void setCookiesReverseDataPopulator(CookiesReverseDataPopulator cookiesReverseDataPopulator) {
        this.cookiesReverseDataPopulator = cookiesReverseDataPopulator;
    }
    public Converter<CookiesModel, CookiesData> getCookiesDataConverter() {
        return cookiesDataConverter;
    }
    public void setCookiesDataConverter(Converter<CookiesModel, CookiesData> cookiesDataConverter) {
        this.cookiesDataConverter = cookiesDataConverter;
    }

}
