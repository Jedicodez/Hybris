/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Mar 30, 2023, 4:28:58 PM                    ---
 * ----------------------------------------------------------------
 */
package my.sonata.myCronJob.jalo;

import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import java.util.HashMap;
import java.util.Map;
import my.sonata.myCronJob.constants.MyCronJobConstants;
import my.sonata.myCronJob.jalo.HelloWorldCronJob;

/**
 * Generated class for type <code>MyCronJobManager</code>.
 */
@SuppressWarnings({"unused","cast"})
@SLDSafe
public class MyCronJobManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public HelloWorldCronJob createHelloWorldCronJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType("HelloWorldCronJob");
			return (HelloWorldCronJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating HelloWorldCronJob : "+e.getMessage(), 0 );
		}
	}
	
	public HelloWorldCronJob createHelloWorldCronJob(final Map attributeValues)
	{
		return createHelloWorldCronJob( getSession().getSessionContext(), attributeValues );
	}
	
	public static final MyCronJobManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (MyCronJobManager) em.getExtension(MyCronJobConstants.EXTENSIONNAME);
	}
	
	@Override
	public String getName()
	{
		return MyCronJobConstants.EXTENSIONNAME;
	}
	
}
