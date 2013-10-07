package org.openmrs.module.specializedmodule.page.controller;

import org.openmrs.module.specializedmodule.PregnancyProfile;
import org.openmrs.module.specializedmodule.PregnancyProfileRepo;
import org.openmrs.ui.framework.annotation.BindParams;
import org.springframework.web.bind.annotation.ModelAttribute;

public class AddPregnancyProfilePageController {

	public void get() {
	}
	
	public String post(@ModelAttribute("pregnancyProfile") @BindParams PregnancyProfile pregPro) {
		PregnancyProfileRepo.addPregnancyProfile(pregPro);
		
		return "redirect:specializedmodule/pregnancyProfile.page";
	}
}
