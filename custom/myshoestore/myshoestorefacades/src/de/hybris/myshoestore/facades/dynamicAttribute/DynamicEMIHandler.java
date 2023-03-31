package de.hybris.myshoestore.facades.dynamicAttribute;

import de.hybris.myshoestore.core.model.PremiumCustomerModel;
import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;

public class DynamicEMIHandler implements DynamicAttributeHandler<Integer, PremiumCustomerModel> {

    public static int totalEMI = 0;

    @Override
    public Integer get(final PremiumCustomerModel model) {
        final Integer buyOnEMI = model.getBuyOnEMI();
        totalEMI = buyOnEMI + (buyOnEMI / 10);
        return totalEMI;
    }

    @Override
    public void set(final PremiumCustomerModel model, final Integer val) {
        if (val != null) {
            throw new UnsupportedOperationException();
        }
    }
}
