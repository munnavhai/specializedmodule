package org.openmrs.module.specializedmodule;

import java.text.ParseException;
import java.util.List;

import org.openmrs.Patient;

public class PregnancyProfileService {

	// REGISTRATION FEE
	/**
	 * Save registration fee
	 * 
	 * @param fee
	 * @return
	 */
	public PregnancyProfile savePregPro(PregnancyProfile pregPro);

	/**
	 * Get registration fee by id
	 * 
	 * @param id
	 * @return
	 */
	public PregnancyProfile getPregnancyProfile(String id);

	/**
	 * Get list of registration fee
	 * 
	 * @param patient
	 * @param numberOfLastDate
	 *            <b>null</b> to search all time
	 * @return
	 * @throws ParseException
	 */
	public List<PregnancyProfile> getRegistrationFees(Patient patient,
			Integer numberOfLastDate) throws ParseException;

	/**
	 * Delete a registration fee
	 * 
	 * @param fee
	 */

}
