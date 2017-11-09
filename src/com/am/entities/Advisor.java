package com.am.entities;

import java.util.Set;

public class Advisor implements java.io.Serializable {

	private int advisorNo;
	private String firstNm;
	private String lastNm;
	private String qualification;
	private int experience;
	private String contactNo;
	private String emailAddress;
	private Set<Jobsheet> jobsheets;
	
	public int getAdvisorNo() {
		return advisorNo;
	}
	public void setAdvisorNo(int advisorNo) {
		this.advisorNo = advisorNo;
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
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public Set<Jobsheet> getJobsheets() {
		return jobsheets;
	}
	public void setJobsheets(Set<Jobsheet> jobsheets) {
		this.jobsheets = jobsheets;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + advisorNo;
		result = prime * result
				+ ((contactNo == null) ? 0 : contactNo.hashCode());
		result = prime * result
				+ ((emailAddress == null) ? 0 : emailAddress.hashCode());
		result = prime * result + experience;
		result = prime * result + ((firstNm == null) ? 0 : firstNm.hashCode());
		result = prime * result + ((lastNm == null) ? 0 : lastNm.hashCode());
		result = prime * result
				+ ((qualification == null) ? 0 : qualification.hashCode());
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
		Advisor other = (Advisor) obj;
		if (advisorNo != other.advisorNo)
			return false;
		if (contactNo == null) {
			if (other.contactNo != null)
				return false;
		} else if (!contactNo.equals(other.contactNo))
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
		if (qualification == null) {
			if (other.qualification != null)
				return false;
		} else if (!qualification.equals(other.qualification))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Advisor [advisorNo=" + advisorNo + ", firstNm=" + firstNm
				+ ", lastNm=" + lastNm + ", qualification=" + qualification
				+ ", experience=" + experience + ", contactNo=" + contactNo
				+ ", emailAddress=" + emailAddress + ", jobsheets=" + jobsheets
				+ "]";
	}



}
