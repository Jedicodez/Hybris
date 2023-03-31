/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Mar 30, 2023, 4:28:58 PM                    ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.myshoestore.core.jalo;

import de.hybris.myshoestore.core.constants.MyshoestoreCoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.myshoestore.core.jalo.Cookies Cookies}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedCookies extends GenericItem
{
	/** Qualifier of the <code>Cookies.pkgId</code> attribute **/
	public static final String PKGID = "pkgId";
	/** Qualifier of the <code>Cookies.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Cookies.MRP</code> attribute **/
	public static final String MRP = "MRP";
	/** Qualifier of the <code>Cookies.mfgBy</code> attribute **/
	public static final String MFGBY = "mfgBy";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(PKGID, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(MRP, AttributeMode.INITIAL);
		tmp.put(MFGBY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cookies.mfgBy</code> attribute.
	 * @return the mfgBy - Manufactured by
	 */
	public String getMfgBy(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MFGBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cookies.mfgBy</code> attribute.
	 * @return the mfgBy - Manufactured by
	 */
	public String getMfgBy()
	{
		return getMfgBy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cookies.mfgBy</code> attribute. 
	 * @param value the mfgBy - Manufactured by
	 */
	public void setMfgBy(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MFGBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cookies.mfgBy</code> attribute. 
	 * @param value the mfgBy - Manufactured by
	 */
	public void setMfgBy(final String value)
	{
		setMfgBy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cookies.MRP</code> attribute.
	 * @return the MRP - Total Cost
	 */
	public Integer getMRP(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MRP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cookies.MRP</code> attribute.
	 * @return the MRP - Total Cost
	 */
	public Integer getMRP()
	{
		return getMRP( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cookies.MRP</code> attribute. 
	 * @return the MRP - Total Cost
	 */
	public int getMRPAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMRP( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cookies.MRP</code> attribute. 
	 * @return the MRP - Total Cost
	 */
	public int getMRPAsPrimitive()
	{
		return getMRPAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cookies.MRP</code> attribute. 
	 * @param value the MRP - Total Cost
	 */
	public void setMRP(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MRP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cookies.MRP</code> attribute. 
	 * @param value the MRP - Total Cost
	 */
	public void setMRP(final Integer value)
	{
		setMRP( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cookies.MRP</code> attribute. 
	 * @param value the MRP - Total Cost
	 */
	public void setMRP(final SessionContext ctx, final int value)
	{
		setMRP( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cookies.MRP</code> attribute. 
	 * @param value the MRP - Total Cost
	 */
	public void setMRP(final int value)
	{
		setMRP( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cookies.name</code> attribute.
	 * @return the name - Name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cookies.name</code> attribute.
	 * @return the name - Name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cookies.name</code> attribute. 
	 * @param value the name - Name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cookies.name</code> attribute. 
	 * @param value the name - Name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cookies.pkgId</code> attribute.
	 * @return the pkgId - This is the Unique ID
	 */
	public Integer getPkgId(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, PKGID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cookies.pkgId</code> attribute.
	 * @return the pkgId - This is the Unique ID
	 */
	public Integer getPkgId()
	{
		return getPkgId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cookies.pkgId</code> attribute. 
	 * @return the pkgId - This is the Unique ID
	 */
	public int getPkgIdAsPrimitive(final SessionContext ctx)
	{
		Integer value = getPkgId( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cookies.pkgId</code> attribute. 
	 * @return the pkgId - This is the Unique ID
	 */
	public int getPkgIdAsPrimitive()
	{
		return getPkgIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cookies.pkgId</code> attribute. 
	 * @param value the pkgId - This is the Unique ID
	 */
	public void setPkgId(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, PKGID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cookies.pkgId</code> attribute. 
	 * @param value the pkgId - This is the Unique ID
	 */
	public void setPkgId(final Integer value)
	{
		setPkgId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cookies.pkgId</code> attribute. 
	 * @param value the pkgId - This is the Unique ID
	 */
	public void setPkgId(final SessionContext ctx, final int value)
	{
		setPkgId( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cookies.pkgId</code> attribute. 
	 * @param value the pkgId - This is the Unique ID
	 */
	public void setPkgId(final int value)
	{
		setPkgId( getSession().getSessionContext(), value );
	}
	
}
