/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package my.sonata.occfacades.controller;

import static my.sonata.occfacades.constants.OccfacadesConstants.PLATFORM_LOGO_CODE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import my.sonata.occfacades.service.OccfacadesService;


@Controller
public class OccfacadesHelloController
{
	@Autowired
	private OccfacadesService occfacadesService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(final ModelMap model)
	{
		model.addAttribute("logoUrl", occfacadesService.getHybrisLogoUrl(PLATFORM_LOGO_CODE));
		return "welcome";
	}
}
