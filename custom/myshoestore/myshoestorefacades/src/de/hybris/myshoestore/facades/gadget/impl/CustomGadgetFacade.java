package de.hybris.myshoestore.facades.gadget.impl;

import de.hybris.myshoestore.core.gadget.GadgetService;
import de.hybris.myshoestore.facades.GadgetData;
import de.hybris.myshoestore.facades.gadget.GadgetFacade;
import de.hybris.myshoestorecore.model.GadgetModel;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

public class CustomGadgetFacade implements GadgetFacade {
    private GadgetService gadgetService;

    @Required
    public void setGadgetService(final GadgetService gadgetService) {
        this.gadgetService = gadgetService;
    }
    @Resource(name = "gadgetDataConverter")
    private Converter<GadgetModel, GadgetData> gadgetDataConverter;
    private static final Logger LOG = Logger.getLogger(CustomGadgetFacade.class);

    @Override
    public List<GadgetData> getGadgetModelDetails() {
        LOG.info("############# CustomGadgetFacade ###############");
        final List<GadgetData> gadgets = new ArrayList<GadgetData>();
        final List<GadgetModel> model = gadgetService.getGadgetModelDetails();
        final List<GadgetData> GadgetData = gadgetDataConverter.convertAll(model);
        gadgets.addAll(GadgetData);
        return gadgets;
    }

}