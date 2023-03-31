package de.hybris.myshoestore.core.cookies;

import de.hybris.myshoestore.core.model.CookiesModel;

import java.util.List;

public interface CookiesService {

    public List<CookiesModel> getCookiesDetails();

    public List<CookiesModel> getSpecificCookiesDetails(final Integer pkgId);

    public void createCookies(CookiesModel cookiesModel);

    public void removeCookies(final Integer pkgId);

    public void replaceCookies(CookiesModel cookies, final Integer pkgId);

    public void updateCookiesMRP(final Integer pkgId, final Integer MRP);

}
