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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem PremiumCustomer}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedPremiumCustomer extends GenericItem
{
	/** Qualifier of the <code>PremiumCustomer.royaltyPoints</code> attribute **/
	public static final String ROYALTYPOINTS = "royaltyPoints";
	/** Qualifier of the <code>PremiumCustomer.specialDiscount</code> attribute **/
	public static final String SPECIALDISCOUNT = "specialDiscount";
	/** Qualifier of the <code>PremiumCustomer.freeDelivery</code> attribute **/
	public static final String FREEDELIVERY = "freeDelivery";
	/** Qualifier of the <code>PremiumCustomer.freeGifts</code> attribute **/
	public static final String FREEGIFTS = "freeGifts";
	/** Qualifier of the <code>PremiumCustomer.buyOnEMI</code> attribute **/
	public static final String BUYONEMI = "buyOnEMI";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ROYALTYPOINTS, AttributeMode.INITIAL);
		tmp.put(SPECIALDISCOUNT, AttributeMode.INITIAL);
		tmp.put(FREEDELIVERY, AttributeMode.INITIAL);
		tmp.put(FREEGIFTS, AttributeMode.INITIAL);
		tmp.put(BUYONEMI, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PremiumCustomer.buyOnEMI</code> attribute.
	 * @return the buyOnEMI - EMI system for users
	 */
	public Integer getBuyOnEMI(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, BUYONEMI);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PremiumCustomer.buyOnEMI</code> attribute.
	 * @return the buyOnEMI - EMI system for users
	 */
	public Integer getBuyOnEMI()
	{
		return getBuyOnEMI( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PremiumCustomer.buyOnEMI</code> attribute. 
	 * @return the buyOnEMI - EMI system for users
	 */
	public int getBuyOnEMIAsPrimitive(final SessionContext ctx)
	{
		Integer value = getBuyOnEMI( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PremiumCustomer.buyOnEMI</code> attribute. 
	 * @return the buyOnEMI - EMI system for users
	 */
	public int getBuyOnEMIAsPrimitive()
	{
		return getBuyOnEMIAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PremiumCustomer.buyOnEMI</code> attribute. 
	 * @param value the buyOnEMI - EMI system for users
	 */
	public void setBuyOnEMI(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, BUYONEMI,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PremiumCustomer.buyOnEMI</code> attribute. 
	 * @param value the buyOnEMI - EMI system for users
	 */
	public void setBuyOnEMI(final Integer value)
	{
		setBuyOnEMI( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PremiumCustomer.buyOnEMI</code> attribute. 
	 * @param value the buyOnEMI - EMI system for users
	 */
	public void setBuyOnEMI(final SessionContext ctx, final int value)
	{
		setBuyOnEMI( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PremiumCustomer.buyOnEMI</code> attribute. 
	 * @param value the buyOnEMI - EMI system for users
	 */
	public void setBuyOnEMI(final int value)
	{
		setBuyOnEMI( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PremiumCustomer.freeDelivery</code> attribute.
	 * @return the freeDelivery - Free Delivery for users
	 */
	public Integer getFreeDelivery(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, FREEDELIVERY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PremiumCustomer.freeDelivery</code> attribute.
	 * @return the freeDelivery - Free Delivery for users
	 */
	public Integer getFreeDelivery()
	{
		return getFreeDelivery( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PremiumCustomer.freeDelivery</code> attribute. 
	 * @return the freeDelivery - Free Delivery for users
	 */
	public int getFreeDeliveryAsPrimitive(final SessionContext ctx)
	{
		Integer value = getFreeDelivery( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PremiumCustomer.freeDelivery</code> attribute. 
	 * @return the freeDelivery - Free Delivery for users
	 */
	public int getFreeDeliveryAsPrimitive()
	{
		return getFreeDeliveryAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PremiumCustomer.freeDelivery</code> attribute. 
	 * @param value the freeDelivery - Free Delivery for users
	 */
	public void setFreeDelivery(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, FREEDELIVERY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PremiumCustomer.freeDelivery</code> attribute. 
	 * @param value the freeDelivery - Free Delivery for users
	 */
	public void setFreeDelivery(final Integer value)
	{
		setFreeDelivery( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PremiumCustomer.freeDelivery</code> attribute. 
	 * @param value the freeDelivery - Free Delivery for users
	 */
	public void setFreeDelivery(final SessionContext ctx, final int value)
	{
		setFreeDelivery( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PremiumCustomer.freeDelivery</code> attribute. 
	 * @param value the freeDelivery - Free Delivery for users
	 */
	public void setFreeDelivery(final int value)
	{
		setFreeDelivery( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PremiumCustomer.freeGifts</code> attribute.
	 * @return the freeGifts - Free gifts for users
	 */
	public Integer getFreeGifts(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, FREEGIFTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PremiumCustomer.freeGifts</code> attribute.
	 * @return the freeGifts - Free gifts for users
	 */
	public Integer getFreeGifts()
	{
		return getFreeGifts( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PremiumCustomer.freeGifts</code> attribute. 
	 * @return the freeGifts - Free gifts for users
	 */
	public int getFreeGiftsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getFreeGifts( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PremiumCustomer.freeGifts</code> attribute. 
	 * @return the freeGifts - Free gifts for users
	 */
	public int getFreeGiftsAsPrimitive()
	{
		return getFreeGiftsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PremiumCustomer.freeGifts</code> attribute. 
	 * @param value the freeGifts - Free gifts for users
	 */
	public void setFreeGifts(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, FREEGIFTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PremiumCustomer.freeGifts</code> attribute. 
	 * @param value the freeGifts - Free gifts for users
	 */
	public void setFreeGifts(final Integer value)
	{
		setFreeGifts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PremiumCustomer.freeGifts</code> attribute. 
	 * @param value the freeGifts - Free gifts for users
	 */
	public void setFreeGifts(final SessionContext ctx, final int value)
	{
		setFreeGifts( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PremiumCustomer.freeGifts</code> attribute. 
	 * @param value the freeGifts - Free gifts for users
	 */
	public void setFreeGifts(final int value)
	{
		setFreeGifts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PremiumCustomer.royaltyPoints</code> attribute.
	 * @return the royaltyPoints - Loyalty points of users
	 */
	public Integer getRoyaltyPoints(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, ROYALTYPOINTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PremiumCustomer.royaltyPoints</code> attribute.
	 * @return the royaltyPoints - Loyalty points of users
	 */
	public Integer getRoyaltyPoints()
	{
		return getRoyaltyPoints( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PremiumCustomer.royaltyPoints</code> attribute. 
	 * @return the royaltyPoints - Loyalty points of users
	 */
	public int getRoyaltyPointsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getRoyaltyPoints( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PremiumCustomer.royaltyPoints</code> attribute. 
	 * @return the royaltyPoints - Loyalty points of users
	 */
	public int getRoyaltyPointsAsPrimitive()
	{
		return getRoyaltyPointsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PremiumCustomer.royaltyPoints</code> attribute. 
	 * @param value the royaltyPoints - Loyalty points of users
	 */
	public void setRoyaltyPoints(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, ROYALTYPOINTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PremiumCustomer.royaltyPoints</code> attribute. 
	 * @param value the royaltyPoints - Loyalty points of users
	 */
	public void setRoyaltyPoints(final Integer value)
	{
		setRoyaltyPoints( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PremiumCustomer.royaltyPoints</code> attribute. 
	 * @param value the royaltyPoints - Loyalty points of users
	 */
	public void setRoyaltyPoints(final SessionContext ctx, final int value)
	{
		setRoyaltyPoints( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PremiumCustomer.royaltyPoints</code> attribute. 
	 * @param value the royaltyPoints - Loyalty points of users
	 */
	public void setRoyaltyPoints(final int value)
	{
		setRoyaltyPoints( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PremiumCustomer.specialDiscount</code> attribute.
	 * @return the specialDiscount - Special Discount for users
	 */
	public Integer getSpecialDiscount(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, SPECIALDISCOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PremiumCustomer.specialDiscount</code> attribute.
	 * @return the specialDiscount - Special Discount for users
	 */
	public Integer getSpecialDiscount()
	{
		return getSpecialDiscount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PremiumCustomer.specialDiscount</code> attribute. 
	 * @return the specialDiscount - Special Discount for users
	 */
	public int getSpecialDiscountAsPrimitive(final SessionContext ctx)
	{
		Integer value = getSpecialDiscount( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PremiumCustomer.specialDiscount</code> attribute. 
	 * @return the specialDiscount - Special Discount for users
	 */
	public int getSpecialDiscountAsPrimitive()
	{
		return getSpecialDiscountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PremiumCustomer.specialDiscount</code> attribute. 
	 * @param value the specialDiscount - Special Discount for users
	 */
	public void setSpecialDiscount(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, SPECIALDISCOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PremiumCustomer.specialDiscount</code> attribute. 
	 * @param value the specialDiscount - Special Discount for users
	 */
	public void setSpecialDiscount(final Integer value)
	{
		setSpecialDiscount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PremiumCustomer.specialDiscount</code> attribute. 
	 * @param value the specialDiscount - Special Discount for users
	 */
	public void setSpecialDiscount(final SessionContext ctx, final int value)
	{
		setSpecialDiscount( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PremiumCustomer.specialDiscount</code> attribute. 
	 * @param value the specialDiscount - Special Discount for users
	 */
	public void setSpecialDiscount(final int value)
	{
		setSpecialDiscount( getSession().getSessionContext(), value );
	}
	
}
