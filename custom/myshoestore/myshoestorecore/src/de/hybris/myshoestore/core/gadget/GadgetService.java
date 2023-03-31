package de.hybris.myshoestore.core.gadget;

import de.hybris.myshoestorecore.model.GadgetModel;

import java.util.List;

public interface GadgetService {

    /**
     * get all gadgets in the system
     * @return {@link GadgetModel }
     */

    public List<GadgetModel>getGadgetModelDetails();

}
