package de.hybris.myshoestore.core.cookies.impl;

import de.hybris.myshoestore.core.cookies.CookiesService;
import de.hybris.myshoestore.core.cookies.dao.CookiesDao;
import de.hybris.myshoestore.core.model.CookiesModel;
import org.apache.log4j.Logger;

import java.util.List;

public class CustomCookiesService implements CookiesService {

    private CookiesDao cookiesDao;

    public CookiesDao getCookiesDao() {
        return cookiesDao;
    }

    public void setCookiesDao(CookiesDao cookiesDao) {
        this.cookiesDao = cookiesDao;
    }

    private static final Logger LOG = Logger.getLogger(CustomCookiesService.class);


    @Override
    public List<CookiesModel> getCookiesDetails() {
        LOG.info("##############    CustomCookiesService, Get     ##############");
        return cookiesDao.getCookiesDetails();
    }

    @Override
    public List<CookiesModel> getSpecificCookiesDetails(final Integer pkgId) {
        LOG.info("##############    CustomCookiesService, Specific    ##############");
        return cookiesDao.getSpecificCookiesDetails(pkgId);
    }

    @Override
    public void createCookies(CookiesModel cookiesModel) {
        LOG.info("##############    CustomCookiesService, Create    ##############");
        getCookiesDao().createCookies(cookiesModel);
    }

    @Override
    public void removeCookies(final Integer pkgId) {
        LOG.info("##############    CustomCookiesService, Remove   ##############");
            List<CookiesModel> cookies = getSpecificCookiesDetails(pkgId);
        getCookiesDao().removeCookies(cookies);
    }

    @Override
    public void replaceCookies(CookiesModel cookies, final Integer pkgId) {
        LOG.info("##############    CustomCookiesService, Replace   ##############");
        getCookiesDao().replaceCookies(cookies, pkgId);
    }

    @Override
    public void updateCookiesMRP(final Integer pkgId, final Integer MRP){
        LOG.info("##############    CustomCookiesService, update MRP    ##############");
        getCookiesDao().updateCookiesMRP(pkgId, MRP);
    }

}