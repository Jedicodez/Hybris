package de.hybris.myshoestore.core.gadget.dao;

import de.hybris.myshoestorecore.model.GadgetModel;

import java.util.List;
import java.util.Optional;

/**
 * Gadget DAO
 */

public interface GadgetDao {

    /**
     * find gadget by ID
     * @param code Gadget ID
     * @return {@link GadgetModel}
     */
//    public Optional<GadgetModel>findByCode(final String code);

    /**
     * get all gadgets in the system
     * @return {@link List<GadgetModel>}
     */
    public List<GadgetModel>getGadgetModelDetails();
}
