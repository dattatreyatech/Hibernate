package com.am.entities;
// Generated Nov 7, 2017 10:45:06 AM by Hibernate Tools 4.3.5.Final

/**
 * JobsheetMechanicId generated by hbm2java
 */
public class JobsheetMechanicId implements java.io.Serializable {

	private int mechanicNo;
	private int jobsheetNo;
	
	public int getMechanicNo() {
		return mechanicNo;
	}
	public void setMechanicNo(int mechanicNo) {
		this.mechanicNo = mechanicNo;
	}
	public int getJobsheetNo() {
		return jobsheetNo;
	}
	public void setJobsheetNo(int jobsheetNo) {
		this.jobsheetNo = jobsheetNo;
	}

	@Override
	public String toString() {
		return "JobsheetMechanicId [mechanicNo=" + mechanicNo + ", jobsheetNo="
				+ jobsheetNo + "]";
	}


}
