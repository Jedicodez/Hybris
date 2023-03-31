package de.hybris.myshoestore.core.gadget.dao.impl;

import de.hybris.myshoestore.core.gadget.dao.GadgetDao;
import de.hybris.myshoestorecore.model.GadgetModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.servicelayer.util.ServicesUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 *
 */

public class CustomGadgetDao implements GadgetDao {
 private static final Logger LOG = LoggerFactory.getLogger(CustomGadgetDao.class);
//    private static final String FIND_BY_CODE = "SELECT {" + GadgetModel.PK + "} from {" + GadgetModel._TYPECODE + "} where {" + GadgetModel.CODE + "} = ? identity ";
//
private FlexibleSearchService flexibleSearchService;
//
//    /**
//     *Find gadget by ID
//     * @param code Gadget ID
//     * @return {@link GadgetModel}
//     */
//    @Override
//    public Optional<GadgetModel> findByCode(final String code) {
//        ServicesUtil.validateParameterNotNullStandardMessage("code",code);
//        final Map<String,String> params = new HashMap<>();
//        params.put("identity",code);
//        final FlexibleSearchQuery query = new FlexibleSearchQuery(FIND_BY_CODE,params);
//        return Optional.ofNullable((getFlexibleSearchService().searchUnique(query)));
//    }

    /**
     * get All gadgets in the System
     *
     * @return {@link List <GadgetModel>}
     */
    @Override
    public List<GadgetModel> getGadgetModelDetails()
    {
        LOG.info("######### CustomGadgetDao ##########");
        final String query = "SELECT {PK} FROM {Gadget}";
        FlexibleSearchQuery searchQuery = new FlexibleSearchQuery(query.toString());
        final SearchResult searchResult = flexibleSearchService.search(searchQuery);
        return searchResult.getResult();
    }

    public FlexibleSearchService getFlexibleSearchService()
    {
        return flexibleSearchService;
    }

    public void setFlexibleSearchService(final FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }
}
