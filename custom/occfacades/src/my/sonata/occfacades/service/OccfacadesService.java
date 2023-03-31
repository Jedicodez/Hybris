/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package my.sonata.occfacades.service;

public interface OccfacadesService
{
	String getHybrisLogoUrl(String logoCode);

	void createLogo(String logoCode);
}
