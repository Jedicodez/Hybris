/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package my.sonata.myCronJob.setup;

import static my.sonata.myCronJob.constants.MyCronJobConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import my.sonata.myCronJob.constants.MyCronJobConstants;
import my.sonata.myCronJob.service.MyCronJobService;


@SystemSetup(extension = MyCronJobConstants.EXTENSIONNAME)
public class MyCronJobSystemSetup
{
	private final MyCronJobService myCronJobService;

	public MyCronJobSystemSetup(final MyCronJobService myCronJobService)
	{
		this.myCronJobService = myCronJobService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		myCronJobService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return MyCronJobSystemSetup.class.getResourceAsStream("/myCronJob/sap-hybris-platform.png");
	}
}
