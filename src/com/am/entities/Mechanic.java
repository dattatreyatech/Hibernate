package com.am.entities;

import java.util.Set;

public class Mechanic implements java.io.Serializable {

	private int mechanicNo;
	private String firstNm;
	private String lastNm;
	private String specialization;
	private int experience;
	private int contactNo;
	private String emailAddress;
	private Set<JobsheetMechanic> jobsheetMechanics;

	public int getMechanicNo() {
		return mechanicNo;
	}

	public void setMechanicNo(int mechanicNo) {
		this.mechanicNo = mechanicNo;
	}

	public String getFirstNm() {
		return firstNm;
	}

	public void setFirstNm(String firstNm) {
		this.firstNm = firstNm;
	}

	public String getLastNm() {
		return lastNm;
	}

	public void setLastNm(String lastNm) {
		this.lastNm = lastNm;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getContactNo() {
		return contactNo;
	}

	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Set<JobsheetMechanic> getJobsheetMechanics() {
		return jobsheetMechanics;
	}

	public void setJobsheetMechanics(Set<JobsheetMechanic> jobsheetMechanics) {
		this.jobsheetMechanics = jobsheetMechanics;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + contactNo;
		result = prime * result
				+ ((emailAddress == null) ? 0 : emailAddress.hashCode());
		result = prime * result + experience;
		result = prime * result + ((firstNm == null) ? 0 : firstNm.hashCode());
		result = prime * result + ((lastNm == null) ? 0 : lastNm.hashCode());
		result = prime * result + mechanicNo;
		result = prime * result
				+ ((specialization == null) ? 0 : specialization.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mechanic other = (Mechanic) obj;
		if (contactNo != other.contactNo)
			return false;
		if (emailAddress == null) {
			if (other.emailAddress != null)
				return false;
		} else if (!emailAddress.equals(other.emailAddress))
			return false;
		if (experience != other.experience)
			return false;
		if (firstNm == null) {
			if (other.firstNm != null)
				return false;
		} else if (!firstNm.equals(other.firstNm))
			return false;
		if (lastNm == null) {
			if (other.lastNm != null)
				return false;
		} else if (!lastNm.equals(other.lastNm))
			return false;
		if (mechanicNo != other.mechanicNo)
			return false;
		if (specialization == null) {
			if (other.specialization != null)
				return false;
		} else if (!specialization.equals(other.specialization))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Mechanic [mechanicNo=" + mechanicNo + ", firstNm=" + firstNm
				+ ", lastNm=" + lastNm + ", specialization=" + specialization
				+ ", experience=" + experience + ", contactNo=" + contactNo
				+ ", emailAddress=" + emailAddress + ", jobsheetMechanics="
				+ jobsheetMechanics + "]";
	}

}
