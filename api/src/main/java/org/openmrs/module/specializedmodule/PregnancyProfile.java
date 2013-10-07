package org.openmrs.module.specializedmodule;

public class PregnancyProfile {
	
	private String patientId;
	
	private String lastLMPDat;
	
	private String approxDeliveryDate;
	
	private String lastVisitDate;
	
	private String nextCheckupDate;
	
	
	
	public PregnancyProfile(String patientId, String lastLMPDat,
			String approxDeliveryDate, String lastVisitDate,
			String nextCheckupDate) {
		super();
		this.patientId = patientId;
		this.lastLMPDat = lastLMPDat;
		this.approxDeliveryDate = approxDeliveryDate;
		this.lastVisitDate = lastVisitDate;
		this.nextCheckupDate = nextCheckupDate;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getLastLMPDat() {
		return lastLMPDat;
	}

	public void setLastLMPDat(String lastLMPDat) {
		this.lastLMPDat = lastLMPDat;
	}

	public String getApproxDeliveryDate() {
		return approxDeliveryDate;
	}

	public void setApproxDeliveryDate(String approxDeliveryDate) {
		this.approxDeliveryDate = approxDeliveryDate;
	}

	public String getLastVisitDate() {
		return lastVisitDate;
	}

	public void setLastVisitDate(String lastVisitDate) {
		this.lastVisitDate = lastVisitDate;
	}

	public String getNextCheckupDate() {
		return nextCheckupDate;
	}

	public void setNextCheckupDate(String nextCheckupDate) {
		this.nextCheckupDate = nextCheckupDate;
	}

	@Override
    public String toString() {
        return patientId + ", " + lastLMPDat+ ", " + approxDeliveryDate+ ", " + lastVisitDate+ ", " + nextCheckupDate;
    }
    
    public PregnancyProfile()
    {
    	
    }
}
