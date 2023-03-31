/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Mar 30, 2023, 4:28:58 PM                    ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.myshoestorecore.jalo;

import de.hybris.myshoestore.core.constants.MyshoestoreCoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.myshoestorecore.jalo.Gadget Gadget}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedGadget extends GenericItem
{
	/** Qualifier of the <code>Gadget.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Gadget.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Gadget.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>Gadget.status</code> attribute **/
	public static final String STATUS = "status";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(STATUS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Gadget.code</code> attribute.
	 * @return the code - This is the Unique code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Gadget.code</code> attribute.
	 * @return the code - This is the Unique code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Gadget.code</code> attribute. 
	 * @param value the code - This is the Unique code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Gadget.code</code> attribute. 
	 * @param value the code - This is the Unique code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Gadget.description</code> attribute.
	 * @return the description - Description.
	 */
	public String getDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Gadget.description</code> attribute.
	 * @return the description - Description.
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Gadget.description</code> attribute. 
	 * @param value the description - Description.
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Gadget.description</code> attribute. 
	 * @param value the description - Description.
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Gadget.name</code> attribute.
	 * @return the name - Name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Gadget.name</code> attribute.
	 * @return the name - Name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Gadget.name</code> attribute. 
	 * @param value the name - Name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Gadget.name</code> attribute. 
	 * @param value the name - Name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Gadget.status</code> attribute.
	 * @return the status - True-Available False-Unavailable
	 */
	public Boolean isStatus(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, STATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Gadget.status</code> attribute.
	 * @return the status - True-Available False-Unavailable
	 */
	public Boolean isStatus()
	{
		return isStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Gadget.status</code> attribute. 
	 * @return the status - True-Available False-Unavailable
	 */
	public boolean isStatusAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isStatus( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Gadget.status</code> attribute. 
	 * @return the status - True-Available False-Unavailable
	 */
	public boolean isStatusAsPrimitive()
	{
		return isStatusAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Gadget.status</code> attribute. 
	 * @param value the status - True-Available False-Unavailable
	 */
	public void setStatus(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, STATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Gadget.status</code> attribute. 
	 * @param value the status - True-Available False-Unavailable
	 */
	public void setStatus(final Boolean value)
	{
		setStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Gadget.status</code> attribute. 
	 * @param value the status - True-Available False-Unavailable
	 */
	public void setStatus(final SessionContext ctx, final boolean value)
	{
		setStatus( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Gadget.status</code> attribute. 
	 * @param value the status - True-Available False-Unavailable
	 */
	public void setStatus(final boolean value)
	{
		setStatus( getSession().getSessionContext(), value );
	}
	
}
