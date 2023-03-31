/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package my.sonata.occfacades.setup;

import static my.sonata.occfacades.constants.OccfacadesConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import my.sonata.occfacades.constants.OccfacadesConstants;
import my.sonata.occfacades.service.OccfacadesService;


@SystemSetup(extension = OccfacadesConstants.EXTENSIONNAME)
public class OccfacadesSystemSetup
{
	private final OccfacadesService occfacadesService;

	public OccfacadesSystemSetup(final OccfacadesService occfacadesService)
	{
		this.occfacadesService = occfacadesService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		occfacadesService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return OccfacadesSystemSetup.class.getResourceAsStream("/occfacades/sap-hybris-platform.png");
	}
}
