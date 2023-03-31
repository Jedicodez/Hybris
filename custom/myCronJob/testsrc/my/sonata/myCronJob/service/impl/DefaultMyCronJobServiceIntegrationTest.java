/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package my.sonata.myCronJob.service.impl;

import static org.assertj.core.api.Assertions.assertThat;
import static my.sonata.myCronJob.constants.MyCronJobConstants.PLATFORM_LOGO_CODE;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.core.model.media.MediaModel;
import de.hybris.platform.servicelayer.ServicelayerBaseTest;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;

import my.sonata.myCronJob.service.MyCronJobService;
import my.sonata.myCronJob.service.impl.DefaultMyCronJobService;


/**
 * This is an example of how the integration test should look like. {@link ServicelayerBaseTest} bootstraps platform so
 * you have an access to all Spring beans as well as database connection. It also ensures proper cleaning out of items
 * created during the test after it finishes. You can inject any Spring service using {@link Resource} annotation. Keep
 * in mind that by default it assumes that annotated field name matches the Spring Bean ID.
 */
@IntegrationTest
public class DefaultMyCronJobServiceIntegrationTest extends ServicelayerBaseTest
{
	@Resource
	private MyCronJobService myCronJobService;
	@Resource
	private FlexibleSearchService flexibleSearchService;

	@Before
	public void setUp() throws Exception
	{
		myCronJobService.createLogo(PLATFORM_LOGO_CODE);
	}

	@Test
	public void shouldReturnProperUrlForLogo() throws Exception
	{
		// given
		final String logoCode = "myCronJobPlatformLogo";

		// when
		final String logoUrl = myCronJobService.getHybrisLogoUrl(logoCode);

		// then
		assertThat(logoUrl).isNotNull();
		assertThat(logoUrl).isEqualTo(findLogoMedia(logoCode).getURL());
	}

	private MediaModel findLogoMedia(final String logoCode)
	{
		final FlexibleSearchQuery fQuery = new FlexibleSearchQuery("SELECT {PK} FROM {Media} WHERE {code}=?code");
		fQuery.addQueryParameter("code", logoCode);

		return flexibleSearchService.searchUnique(fQuery);
	}

}