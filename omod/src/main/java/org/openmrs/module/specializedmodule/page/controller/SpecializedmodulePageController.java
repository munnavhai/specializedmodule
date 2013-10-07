
package org.openmrs.module.specializedmodule.page.controller;

import org.openmrs.module.appui.UiSessionContext;
import org.openmrs.ui.framework.page.PageModel;

public class SpecializedmodulePageController {

	public void controller(PageModel model, UiSessionContext sessionContext) {
		model.addAttribute("user", sessionContext.getCurrentUser());
	}
}
 