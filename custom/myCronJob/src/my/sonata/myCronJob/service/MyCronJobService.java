/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package my.sonata.myCronJob.service;

public interface MyCronJobService
{
	String getHybrisLogoUrl(String logoCode);

	void createLogo(String logoCode);
}
