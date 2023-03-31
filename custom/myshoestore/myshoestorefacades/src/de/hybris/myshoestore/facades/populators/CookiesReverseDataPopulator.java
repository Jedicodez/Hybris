package de.hybris.myshoestore.facades.populators;


import de.hybris.myshoestore.core.model.CookiesModel;
import de.hybris.myshoestore.facades.CookiesData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import org.apache.log4j.Logger;
import org.springframework.util.Assert;

public class CookiesReverseDataPopulator implements Populator<CookiesData, CookiesModel> {
    private static final Logger LOG = Logger.getLogger(CookiesReverseDataPopulator.class);
    @Override
    public void populate(final CookiesData source, final CookiesModel target) throws ConversionException {
        LOG.info("reverse populator");
        Assert.notNull(source,"source not null");
        Assert.notNull(target,"target not null");
        target.setPkgId(source.getPkgId());
        target.setName(source.getName());
        target.setMfgBy(source.getMfgBy());
        target.setMRP(source.getMRP());
    }
}
