package de.hybris.myshoestore.core.gadget.impl;

import de.hybris.myshoestore.core.gadget.GadgetService;
import de.hybris.myshoestore.core.gadget.dao.GadgetDao;
import de.hybris.myshoestorecore.model.GadgetModel;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;

public class CustomGadgetService implements GadgetService {

    private static final Logger LOG = Logger.getLogger(CustomGadgetService.class);
    private GadgetDao gadgetDao;
    @Required
    public void setGadgetDao(final GadgetDao gadgetDao)
    {
        this.gadgetDao = gadgetDao;
    }
    @Override
    public List<GadgetModel> getGadgetModelDetails() {
        LOG.info("########## GadgetService #########");
        return gadgetDao.getGadgetModelDetails();
    }
}
