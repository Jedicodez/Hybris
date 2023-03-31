package de.hybris.myshoestore.core.Premium.Impl;

import de.hybris.myshoestore.core.Premium.Intf.PremiumCustomerDao;
import de.hybris.myshoestore.core.Premium.Intf.PremiumCustomerService;
import de.hybris.myshoestore.core.model.PremiumCustomerModel;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;
public class PremiumCustomerServiceImpl implements PremiumCustomerService {
    private PremiumCustomerDao premiumCustomerDao;

    @Required
    public void setPremiumCustomerDao(final PremiumCustomerDao premiumCustomerDao)
    {
        this.premiumCustomerDao = premiumCustomerDao;
    }
    private static final Logger LOG = Logger.getLogger(PremiumCustomerServiceImpl.class);
    @Override
    public List<PremiumCustomerModel> getPremiumCustomerDetails() {
        LOG.info("##########customerServiceImpl#########");
        return premiumCustomerDao.getPremiumCustomerDetails();
    }
}
