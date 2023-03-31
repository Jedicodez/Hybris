package de.hybris.myshoestore.core.interceptor.validateInterceptor;

import de.hybris.myshoestore.core.model.PremiumCustomerModel;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;
import org.apache.commons.lang.math.NumberUtils;
import org.apache.log4j.Logger;

public class CustomValidateInterceptor implements ValidateInterceptor {

    private static final Logger LOG = Logger.getLogger(CustomValidateInterceptor.class);

    @Override
    public void onValidate(Object o, InterceptorContext interceptorContext) throws InterceptorException {
        LOG.info("######## CustomValidateInterceptor #############");
        if (o instanceof PremiumCustomerModel) {
            final PremiumCustomerModel model = (PremiumCustomerModel) o;
            if (NumberUtils.compare(model.getBuyOnEMI(),100)==-1) {
                throw new InterceptorException("Premium Customer cannot have empty EMI points");
            }
        }
    }
}
