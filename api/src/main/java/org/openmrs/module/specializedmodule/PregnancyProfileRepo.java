
package org.openmrs.module.specializedmodule;

import java.util.ArrayList;
import java.util.List;

public class PregnancyProfileRepo {

	private static List<PregnancyProfile> pregnancyProfile = new ArrayList<PregnancyProfile>();
	
	public static List<PregnancyProfile> getPregnancyProfile() {
		if (pregnancyProfile.isEmpty()) {
			pregnancyProfile.add(new PregnancyProfile("Patient 1", "03-jan-2013","02-sept-2013", "04-feb-2013","05-mar-2013"));
			pregnancyProfile.add(new PregnancyProfile("Patient 2", "03-jun-2013","02-feb-2014", "04-jul-2013","05-aug-2013"));
			pregnancyProfile.add(new PregnancyProfile("Patient 3", "03-aug-2013","02-dec-2013", "04-feb-2014","05-sept-2013"));
			pregnancyProfile.add(new PregnancyProfile("Patient 4", "03-mar-2013","02-feb-2013", "04-dec-2013","05-april-2013"));
		}
		
		return pregnancyProfile;
	}
	
	public static void addPregnancyProfile(PregnancyProfile pregnancyProfiles) {
		pregnancyProfile.add(pregnancyProfiles);
	}
}
