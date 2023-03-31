/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package my.sonata.myCronJob.controller;

import static my.sonata.myCronJob.constants.MyCronJobConstants.PLATFORM_LOGO_CODE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import my.sonata.myCronJob.service.MyCronJobService;


@Controller
public class MyCronJobHelloController
{
	@Autowired
	private MyCronJobService myCronJobService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(final ModelMap model)
	{
		model.addAttribute("logoUrl", myCronJobService.getHybrisLogoUrl(PLATFORM_LOGO_CODE));
		return "welcome";
	}
}
