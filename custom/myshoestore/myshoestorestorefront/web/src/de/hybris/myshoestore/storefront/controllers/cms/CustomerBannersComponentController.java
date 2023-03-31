package de.hybris.myshoestore.storefront.controllers.cms;

import de.hybris.myshoestore.core.model.CustomBannersComponentModel;
import de.hybris.myshoestore.storefront.controllers.ControllerConstants;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.cms.AbstractCMSComponentController;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller("CustomerBannersComponentController")
@Scope("tenant")
@RequestMapping(value = ControllerConstants.Actions.Cms.CustomBannersComponent)
public class CustomerBannersComponentController extends AbstractCMSComponentController<CustomBannersComponentModel> {
    @Override
    protected void fillModel(final HttpServletRequest request, final Model model, final CustomBannersComponentModel component) {
        model.addAttribute("bannerImageLinks", component.getOfferImageLink());

        model.addAttribute("bannerImage", component.getBannerImage());

        model.addAttribute("headerText", component.getHeadrerText());

        model.addAttribute("footerText", component.getFooterText());
    }

    @Override
    protected String getView(CustomBannersComponentModel component) {
        return ControllerConstants.Actions.Cms.CustomBannersComponent;
    }
}

