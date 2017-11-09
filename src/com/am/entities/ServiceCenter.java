package com.am.entities;

import java.util.Set;

public class ServiceCenter implements java.io.Serializable {

	private int serviceCenterNo;
	private String serviceCenterNm;
	private int contactNo;
	private String emailAddress;
	private Dealer dealer;
	private Address address;
	private Set<Jobsheet> jobsheets;
	
	public int getServiceCenterNo() {
		return serviceCenterNo;
	}
	public void setServiceCenterNo(int serviceCenterNo) {
		this.serviceCenterNo = serviceCenterNo;
	}
	public String getServiceCenterNm() {
		return serviceCenterNm;
	}
	public void setServiceCenterNm(String serviceCenterNm) {
		this.serviceCenterNm = serviceCenterNm;
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
	public Dealer getDealer() {
		return dealer;
	}
	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
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
		result = prime * result + contactNo;
		result = prime * result
				+ ((emailAddress == null) ? 0 : emailAddress.hashCode());
		result = prime * result
				+ ((serviceCenterNm == null) ? 0 : serviceCenterNm.hashCode());
		result = prime * result + serviceCenterNo;
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
		ServiceCenter other = (ServiceCenter) obj;
		if (contactNo != other.contactNo)
			return false;
		if (emailAddress == null) {
			if (other.emailAddress != null)
				return false;
		} else if (!emailAddress.equals(other.emailAddress))
			return false;
		if (serviceCenterNm == null) {
			if (other.serviceCenterNm != null)
				return false;
		} else if (!serviceCenterNm.equals(other.serviceCenterNm))
			return false;
		if (serviceCenterNo != other.serviceCenterNo)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ServiceCenter [serviceCenterNo=" + serviceCenterNo
				+ ", serviceCenterNm=" + serviceCenterNm + ", contactNo="
				+ contactNo + ", emailAddress=" + emailAddress + ", dealer="
				+ dealer + ", address=" + address + ", jobsheets=" + jobsheets
				+ "]";
	}
}
