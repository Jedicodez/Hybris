package de.hybris.kiranacommercewebservices.v2.controller;

import de.hybris.kiranacommercewebservices.queues.data.CookiesDataList;
import de.hybris.myshoestore.facades.CookiesData;
import de.hybris.myshoestore.facades.cookies.CookiesFacade;
import de.hybris.platform.commercewebservicescommons.dto.Cookies.CookiesDataListWSDTO;
import de.hybris.platform.commercewebservicescommons.dto.Cookies.CookiesDataWSDTO;
import de.hybris.platform.webservicescommons.swagger.ApiBaseSiteIdParam;
import de.hybris.platform.webservicescommons.swagger.ApiFieldsParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Authorization;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/myShoeStore/en")
@Api(tags = "Cookies")
public class CookiesController extends BaseCommerceController {

    private static final String COOKIES_MAPPING = "pkgId, name, MRP, mfgBy";
    public static final String COOKIES_DOES_NOT_EXIST = "cookies with given pkgid:'%s' doesn't exist";
    private static final String OBJECT_NAME_Pkg_ID = "pkgId";
    private static final Logger LOGGER = Logger.getLogger(CookiesController.class);

    @Resource(name = "customCookiesFacade")
    private CookiesFacade cookiesFacade;

    public CookiesFacade getCookiesFacade() {
        return cookiesFacade;
    }
    public void setCookiesFacade(CookiesFacade cookiesFacade) {
        this.cookiesFacade = cookiesFacade;
    }

    //READ

    @Secured("ROLE_TRUSTED_CLIENT")
    @RequestMapping(value = "/{pkgId}", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(nickname = "getCookiesDetails", value = "get a specific Cookies details",
            notes = "Return a specific Cookies based on pkgId", authorizations = {@Authorization
            (value = "oauth2_client_credentials")})

    @ApiBaseSiteIdParam
    public CookiesDataListWSDTO getCookiesDetails(@ApiParam(value = "pkgId", required = true)
                                                  @PathVariable final Integer
                                                          pkgId, @ApiParam(value = "Response configuaration. This is the list of field that should be returned in the response body", allowableValues = "BASIC,DEFAULT,FULL")
                                                  @RequestParam(defaultValue = DEFAULT_FIELD_SET) final Integer fields)
    {
        LOGGER.info("Cookies is " + pkgId);
        final CookiesDataList cookiesDataList = new CookiesDataList();
        cookiesDataList.setCookies(cookiesFacade.getSpecificCookiesDetails(pkgId));
        return getDataMapper().map(cookiesDataList, CookiesDataListWSDTO.class);
    }

    //UPDATE
    @Secured("ROLE_TRUSTED_CLIENT")
    @RequestMapping(value = "/{pkgId}", method = RequestMethod.PUT, consumes =
            { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(nickname = "replaceCookies", value = "Updates cookies details",
            notes = "Updates cookies details.",
            authorizations = {@Authorization(value = "oauth2_client_credentials")})
    @ApiBaseSiteIdParam
    public void replaceStudent(@ApiParam(value = "PKG ID", required = true)
                               @PathVariable final Integer pkgId,
                               @ApiParam(value = "Cookies object.", required = true)
                               @RequestBody final CookiesDataWSDTO cookies)
    {
        if (getCookiesFacade().getSpecificCookiesDetails(pkgId).isEmpty())
        {
            LOGGER.error("Cookies Not Found");
        }
        else
        {
            final CookiesData cookiesData = getDataMapper().map(cookies,
                    CookiesData.class, COOKIES_MAPPING);
            this.getCookiesFacade().replaceCookies(cookiesData, pkgId);
        }
    }
    @Secured("ROLE_TRUSTED_CLIENT")
    @RequestMapping(
            value = {"/{pkgId}"}, method = {RequestMethod.PATCH})
    @ResponseBody
    @ApiOperation(nickname = "UpdateCookies", value = "Updates cookies MRP",
            notes = "Updates cookies MRP",
            authorizations = {@Authorization(value = "oauth2_client_credentials")})
    @ApiBaseSiteIdParam
    @ResponseStatus(HttpStatus.OK)
    public void replaceCookies(@ApiParam(value = "PKG ID", required = true)
                               @PathVariable final Integer pkgId,
                               @ApiParam(value = "Cookies New MRP.", required = true)
                               @RequestParam final Integer MRP )
    {
        if (getCookiesFacade().getSpecificCookiesDetails(pkgId).isEmpty())
        {
            LOGGER.error("Cookies Not Found");
        }
        else
        {
            getCookiesFacade().updateCookiesMRP(pkgId, MRP);
        }
    }

    // CREATE

    @Secured("ROLE_TRUSTED_CLIENT")
    @RequestMapping (value = {"/{pkgId}"}, method = {RequestMethod.POST})
    @ResponseBody
    @ApiOperation(nickname = "createCookies", value = "Create a Cookie", notes = "Create a Cookies",
            authorizations = {@Authorization(value = "oauth2_client_credentials")})
    @ApiBaseSiteIdParam
    @ResponseStatus(HttpStatus.OK)
    public CookiesDataWSDTO createCookies(@ApiParam(value = "Cookies object", required = true) @RequestBody final
                                          CookiesDataWSDTO cookies,
                                          @ApiFieldsParam @RequestParam(defaultValue = DEFAULT_FIELD_SET) final
                                          Integer fields)
    {
        final CookiesData cookiesData = getDataMapper().map(cookies,
                CookiesData.class, COOKIES_MAPPING);
        this.getCookiesFacade().createCookies(cookiesData);
        return getDataMapper().map(cookiesData, CookiesDataWSDTO.class);
    }


    //DELETE
    @Secured({"ROLE_TRUSTED_CLIENT"})
    @RequestMapping(value = {"/{pkgId}"}, method = {RequestMethod.DELETE}
    )
    @ApiOperation(nickname = "removeCookies", value = "Delete Cookies",
            notes = "Removes Cookies",
            authorizations = {@Authorization("oauth2_client_credentials")}
    )
    @ApiBaseSiteIdParam
    @ResponseStatus(HttpStatus.OK)
    public void removeCookies(@ApiParam(value = "Cookies identifier.",required =
            true) @PathVariable Integer pkgId) {
        LOGGER.info("removeCookies: id = " + pkgId);
        this.getCookiesFacade().removeCookies(pkgId);
    }
}
