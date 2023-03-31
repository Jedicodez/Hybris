package de.hybris.myshoestore.core.Premium.Impl;

import de.hybris.myshoestore.core.Premium.Intf.PremiumCustomerDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import java.util.List;
import org.apache.log4j.Logger;
import de.hybris.myshoestore.core.model.PremiumCustomerModel;

public class PremiumCustomerDaoImpl implements PremiumCustomerDao {
    private static final Logger LOG = Logger.getLogger(PremiumCustomerDaoImpl.class);
    private FlexibleSearchService flexibleSearchService;
    public void setFlexibleSearchService(final FlexibleSearchService flexibleSearchService)
    {
        this.flexibleSearchService = flexibleSearchService;
    }

    @Override
    public List<PremiumCustomerModel> getPremiumCustomerDetails() {
        LOG.info("######### customerDao ##########");
        final String query = "SELECT {PK} FROM {PremiumCustomer}";
        FlexibleSearchQuery searchQuery = new FlexibleSearchQuery(query.toString());
        final SearchResult searchResult = flexibleSearchService.search(searchQuery);
        return searchResult.getResult();
    }
}