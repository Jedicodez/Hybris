package de.hybris.myshoestore.facades.premiumCustomer.impl;

import de.hybris.myshoestore.core.Premium.Intf.PremiumCustomerService;
import de.hybris.myshoestore.core.model.PremiumCustomerModel;
import de.hybris.myshoestore.facades.PremiumCustomerData;
import de.hybris.myshoestore.facades.premiumCustomer.Intf.PremiumCustomerFacade;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

public class PremiumCustomerFacadeImpl implements PremiumCustomerFacade {
    private PremiumCustomerService premiumCustomerService;
    @Required
    public void setPremiumCustomerService(final PremiumCustomerService premiumCustomerService)
    {
        this.premiumCustomerService = premiumCustomerService;
    }
    @Resource(name = "premiumCustomerDataConverter")
    private Converter<PremiumCustomerModel, PremiumCustomerData> PremiumCustomerDataConverter;
    private static final Logger LOG = Logger.getLogger(PremiumCustomerFacadeImpl.class);
    @Override
    public List<PremiumCustomerData> getPremiumCustomerDetails() {
        LOG.info("############# PremiumProductFacadeImpl ###############");
        final List<PremiumCustomerData> customers = new ArrayList<PremiumCustomerData>();
        final List<PremiumCustomerModel> model = premiumCustomerService.getPremiumCustomerDetails();
        final List<PremiumCustomerData> premiumCustomerData = PremiumCustomerDataConverter.convertAll(model);
        customers.addAll(premiumCustomerData);
        return customers;
    }
}