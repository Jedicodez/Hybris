package de.hybris.myshoestore.facades.populators;


import de.hybris.myshoestore.core.model.CookiesModel;
import de.hybris.myshoestore.facades.CookiesData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import org.apache.log4j.Logger;
import org.springframework.util.Assert;

public class CookiesDataPopulator implements Populator<CookiesModel,CookiesData > {

    private static final Logger LOG = Logger.getLogger(CookiesDataPopulator.class);

    @Override
    public void populate(final CookiesModel source, final CookiesData target) throws ConversionException {
        LOG.info("########## CookiesDetailsDataPopulator ###########");
        Assert.notNull(source, "Parameter source can not be null");
        Assert.notNull(target, "Parameter target can not be null");
        target.setPkgId(source.getPkgId());
        target.setName(source.getName());
        target.setMRP(source.getMRP());
        target.setMfgBy(source.getMfgBy());
    }
}