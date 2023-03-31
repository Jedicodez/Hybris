/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package my.sonata.occcore.setup;

import static my.sonata.occcore.constants.OcccoreConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import my.sonata.occcore.constants.OcccoreConstants;
import my.sonata.occcore.service.OcccoreService;


@SystemSetup(extension = OcccoreConstants.EXTENSIONNAME)
public class OcccoreSystemSetup
{
	private final OcccoreService occcoreService;

	public OcccoreSystemSetup(final OcccoreService occcoreService)
	{
		this.occcoreService = occcoreService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		occcoreService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return OcccoreSystemSetup.class.getResourceAsStream("/occcore/sap-hybris-platform.png");
	}
}
