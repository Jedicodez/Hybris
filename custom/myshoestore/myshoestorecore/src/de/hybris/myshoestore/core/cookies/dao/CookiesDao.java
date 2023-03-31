package de.hybris.myshoestore.core.cookies.dao;

import de.hybris.myshoestore.core.model.CookiesModel;

import java.util.List;

public interface CookiesDao {

    public List<CookiesModel> getCookiesDetails();

    public List<CookiesModel> getSpecificCookiesDetails(final Integer pkgId);

    public void createCookies(CookiesModel cookiesModel);

    public void removeCookies(List<CookiesModel> cookies);

    public void replaceCookies(CookiesModel cookies, final Integer pkgId);

    public void updateCookiesMRP(final Integer pkgId, final Integer MRP);

}
