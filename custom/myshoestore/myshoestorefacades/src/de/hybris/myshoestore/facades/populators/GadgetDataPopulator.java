package de.hybris.myshoestore.facades.populators;

import de.hybris.myshoestore.facades.GadgetData;
import de.hybris.myshoestorecore.model.GadgetModel;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import org.apache.log4j.Logger;
import org.springframework.util.Assert;
public class GadgetDataPopulator implements Populator<GadgetModel, GadgetData> {
    private static final Logger LOG = Logger.getLogger(GadgetDataPopulator.class);

    @Override
    public void populate(GadgetModel source, GadgetData target) throws ConversionException {
        LOG.info("########### GadgetDataPopulator #############");
        Assert.notNull(source, "Paramenter Source Cannot be Null");
        Assert.notNull(target, "Paramenter target Cannot be Null");
        target.setCode(source.getCode());
        target.setName(source.getName());
        target.setDescription(source.getDescription());
        target.setStatus(source.getStatus());
    }
}