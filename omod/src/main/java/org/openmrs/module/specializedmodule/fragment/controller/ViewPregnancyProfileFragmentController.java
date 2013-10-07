
package org.openmrs.module.specializedmodule.fragment.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.module.specializedmodule.PregnancyProfileRepo;
import org.openmrs.ui.framework.fragment.FragmentModel;
 

public class ViewPregnancyProfileFragmentController {

	protected Log log = LogFactory.getLog(getClass());
	public void controller(FragmentModel fragmentModel) {
		fragmentModel.addAttribute("pregProfile", PregnancyProfileRepo.getPregnancyProfile());
		log.info("Refreshing Specialized Module Module");
	}
}
