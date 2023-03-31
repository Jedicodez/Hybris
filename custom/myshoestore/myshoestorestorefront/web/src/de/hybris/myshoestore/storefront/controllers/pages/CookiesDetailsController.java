package de.hybris.myshoestore.storefront.controllers.pages;

import de.hybris.myshoestore.core.cookies.CookiesForm;
import de.hybris.myshoestore.core.jalo.Cookies;
import de.hybris.myshoestore.facades.CookiesData;
import de.hybris.myshoestore.facades.cookies.CookiesFacade;
import de.hybris.myshoestore.storefront.controllers.ControllerConstants;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.util.GlobalMessages;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.ContentPageModel;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
@Controller
@RequestMapping(value = "/Dessert")
public class CookiesDetailsController extends AbstractPageController {
    private static final String FORM_GLOBAL_ERROR = "form.global.error";
    private static final String REDIRECT_TO_NEW_COOKIES = REDIRECT_PREFIX + "/Dessert/cookies";
    @Autowired
    private CookiesFacade cookiesFacade;
    private static final Logger LOG = Logger.getLogger(CookiesDetailsController.class);

//    READ

    @RequestMapping(value = "/cookies", method = RequestMethod.GET)
    public String getCookiesDetails(final Model model) throws CMSItemNotFoundException {
        LOG.info("############### CookiesDetailsController  #############");

        final List<CookiesData> cookiesData = cookiesFacade.getCookiesDetails();

        model.addAttribute("cookiesData", cookiesData);

        storeCmsPageInModel(model, getContentPageForLabelOrId("cookies"));
        setUpMetaDataForContentPage(model, getContentPageForLabelOrId("cookies"));
        return ControllerConstants.Views.Pages.Product.CookiesDetails;
    }

//    CREATE

    @RequestMapping(value = "/createCookies", method = RequestMethod.GET)
    public String createCookies(final Model model) throws CMSItemNotFoundException
    {
        LOG.info("######## createCookiesController ########");
        final CookiesForm cookiesForm = getPreparedCookiesForm();
        model.addAttribute("cookiesForm", new CookiesForm());
        final ContentPageModel createCookiesPage = getContentPageForLabelOrId("createCookies");
        storeCmsPageInModel(model, createCookiesPage);
        setUpMetaDataForContentPage(model, createCookiesPage);
        return ControllerConstants.Views.Pages.Product.CreateCookies;
    }

    @RequestMapping(value = "/createCookies", method = RequestMethod.POST)
    public String createCookies(final CookiesForm cookiesForm, final BindingResult bindingResult, final Model model,
                                final RedirectAttributes redirectAttributes) throws CMSItemNotFoundException
    {
        LOG.info("######## createCookiesController ########");
        if (bindingResult.hasErrors())
        {
            GlobalMessages.addErrorMessage(model, FORM_GLOBAL_ERROR);
            final ContentPageModel createCookies = getContentPageForLabelOrId("createCookies");
            storeCmsPageInModel(model, createCookies);
            setUpMetaDataForContentPage(model, createCookies);
            return getViewForPage(model);
        }
        String returnAction = REDIRECT_TO_NEW_COOKIES;
        final CookiesData newCookies = new CookiesData();
        newCookies.setPkgId(cookiesForm.getPkgId());
        newCookies.setName(cookiesForm.getName());
        newCookies.setMRP(cookiesForm.getMRP());
        newCookies.setMfgBy(cookiesForm.getMfgBy());


        model.addAttribute("newCookiesForm", new CookiesForm());

        final ContentPageModel createCookiesPage = getContentPageForLabelOrId("createCookies");
        storeCmsPageInModel(model, createCookiesPage);
        setUpMetaDataForContentPage(model, createCookiesPage);

        getCookiesFacade().createCookies(newCookies);
        GlobalMessages.addFlashMessage(redirectAttributes, GlobalMessages.CONF_MESSAGES_HOLDER,
                "New Package Created!", null);
        return returnAction;
    }
    public CookiesFacade getCookiesFacade() {
        return cookiesFacade;
    }
    public void setCookiesFacade(CookiesFacade cookiesFacade) {
        this.cookiesFacade = cookiesFacade;
    }
    protected CookiesForm getPreparedCookiesForm()
    {
        final CookiesForm cookiesForm = new CookiesForm();
        cookiesForm.setPkgId(123);
        cookiesForm.setName("Cookies Name");
        cookiesForm.setMRP(0);
        cookiesForm.setMfgBy("Manufactured by");
        return cookiesForm;
    }

    @RequestMapping(value = "/updateCookies", method = RequestMethod.GET)
    public String updateCookies(final Model model) throws CMSItemNotFoundException
    {
        LOG.info("######## updateCookiesController ########");
        model.addAttribute("cookiesForm", new CookiesForm());
        final ContentPageModel updateCookiesPage = getContentPageForLabelOrId("updateCookies");
        storeCmsPageInModel(model, updateCookiesPage);
        setUpMetaDataForContentPage(model, updateCookiesPage);
        return ControllerConstants.Views.Pages.Product.UpdateCookies;
    }

    @RequestMapping(value = "/updateCookies", method = RequestMethod.POST)
    public String updateCookies(final CookiesForm cookiesForm, final BindingResult bindingResult, final Model model,
                                   final RedirectAttributes redirectAttributes) throws CMSItemNotFoundException
    {
        LOG.info("######## updateCookiesController ########");
        if(cookiesForm.getPkgId() == null)
        {
            GlobalMessages.addFlashMessage(redirectAttributes, GlobalMessages.ERROR_MESSAGES_HOLDER, "Please Enter PkgId", null);
            return REDIRECT_PREFIX + "updateCookies";
        }
        if(getCookiesFacade().getSpecificCookiesDetails(cookiesForm.getPkgId()).isEmpty())
        {
            GlobalMessages.addFlashMessage(redirectAttributes, GlobalMessages.ERROR_MESSAGES_HOLDER, "Cookies Not Found", null);
            return REDIRECT_PREFIX + "updateCookies";
        }
        if (bindingResult.hasErrors())
        {
            GlobalMessages.addErrorMessage(model, FORM_GLOBAL_ERROR);
            final ContentPageModel updateCookiesMRP = getContentPageForLabelOrId("updateCookies");
            storeCmsPageInModel(model, updateCookiesMRP);
            setUpMetaDataForContentPage(model, updateCookiesMRP);
            return getViewForPage(model);
        }
        String returnAction = REDIRECT_TO_NEW_COOKIES;

        final List <CookiesData> cookiesData = cookiesFacade.getSpecificCookiesDetails(cookiesForm.getPkgId());

        model.addAttribute("cookiesForm", new CookiesForm());

        final ContentPageModel updateCookiesMRP = getContentPageForLabelOrId("updateCookies");
        storeCmsPageInModel(model, updateCookiesMRP);
        setUpMetaDataForContentPage(model, updateCookiesMRP);

        getCookiesFacade().updateCookiesMRP(cookiesForm.getPkgId(), cookiesForm.getMRP());
        GlobalMessages.addFlashMessage(redirectAttributes, GlobalMessages.CONF_MESSAGES_HOLDER,
                "Cookies MRP Updated!", null);
        return returnAction;
    }

    @RequestMapping(value = "/deleteCookies/{pkgId}", method = RequestMethod.POST)
    public String deleteCookies(@PathVariable final Integer pkgId,
                                   final RedirectAttributes redirectAttributes) throws CMSItemNotFoundException
    {
    LOG.info("########### Cookies Controller , Delete ##########");
    String returnAction = REDIRECT_TO_NEW_COOKIES;
    getCookiesFacade().removeCookies(pkgId);
    GlobalMessages.addFlashMessage(redirectAttributes,GlobalMessages.CONF_MESSAGES_HOLDER,
            "Cookies Removed with pkgId - " + pkgId + "!", null);
    return returnAction;
    }
}