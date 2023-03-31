package de.hybris.myshoestore.storefront.controllers.pages;


import de.hybris.myshoestore.facades.PremiumCustomerData;
import de.hybris.myshoestore.facades.premiumCustomer.Intf.PremiumCustomerFacade;
import de.hybris.myshoestore.storefront.controllers.ControllerConstants;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping(value = "/premium")
public class PremiumCustomerDetailsController extends AbstractPageController {
    @Autowired
    private PremiumCustomerFacade premiumCustomerFacade;

    //    private static final String UPDATE_OLD_PASSWORD_CMS_PAGE = "premiumCustomer";
    private static final Logger LOG = Logger.getLogger(PremiumCustomerDetailsController.class);

    @RequestMapping(value = "/premiumCustomer", method = RequestMethod.GET)
    public String getPremiumCustomerDetails(final Model model) throws CMSItemNotFoundException {
        LOG.info("############### PremiumCustomerDetailsController updateOldPassword() method #############");

        final List<PremiumCustomerData> premiumCustomerData = premiumCustomerFacade.getPremiumCustomerDetails();

        model.addAttribute("premiumCustomerData", premiumCustomerData);

        storeCmsPageInModel(model, getContentPageForLabelOrId("premiumCustomer"));
        setUpMetaDataForContentPage(model, getContentPageForLabelOrId("premiumCustomer"));
        return ControllerConstants.Views.Pages.Product.PremiumCustomerDetails;
    }
}