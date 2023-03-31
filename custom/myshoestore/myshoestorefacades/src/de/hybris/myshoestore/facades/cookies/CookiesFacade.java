package de.hybris.myshoestore.facades.cookies;

import de.hybris.myshoestore.core.model.CookiesModel;
import de.hybris.myshoestore.facades.CookiesData;

import java.util.List;

public interface CookiesFacade {

    public List<CookiesData> getCookiesDetails();

    public List<CookiesData> getSpecificCookiesDetails(final Integer pkgId);

    public void createCookies(CookiesData cookiesData);

    public void removeCookies(final Integer pkgId);

    public void replaceCookies(final CookiesData cookiesData, final Integer pkgId);

    public void updateCookiesMRP(final Integer pkgId, final Integer MRP);

}
