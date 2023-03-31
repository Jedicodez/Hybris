package de.hybris.myshoestore.facades.populators;

import de.hybris.myshoestore.core.model.PremiumCustomerModel;
import de.hybris.myshoestore.facades.PremiumCustomerData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import org.apache.log4j.Logger;
import org.springframework.util.Assert;

public class PremiumCustomerDataPopulator implements Populator<PremiumCustomerModel, PremiumCustomerData> {

    private static final Logger LOG = Logger.getLogger(PremiumCustomerDataPopulator.class);

    @Override
    public void populate(PremiumCustomerModel source, PremiumCustomerData target) throws ConversionException {
        LOG.info("########### PreminumCustomerDataPopulator #############");
        Assert.notNull(source, "Paramenter Source Cannot be Null");
        Assert.notNull(target, "Paramenter target Cannot be Null");
        target.setRoyaltyPoints(source.getRoyaltyPoints());
        target.setFreeDelivery(source.getFreeDelivery());
        target.setFreeGifts(source.getFreeGifts());
        target.setSpecialDiscount(source.getSpecialDiscount());
        target.setBuyOnEMI(source.getBuyOnEMI());
        target.setTotalEMI(source.getTotalEMI());
    }
}