package com.am.entities;

public class CustomerId implements java.io.Serializable {

	private int customerNo;
	private String firstNm;
	private String lastNm;
	private int mobile;
	private String emailAddress;
	private int customerAddressId;
	
	public int getCustomerNo() {
		return customerNo;
	}
	public void setCustomerNo(int customerNo) {
		this.customerNo = customerNo;
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
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public int getCustomerAddressId() {
		return customerAddressId;
	}
	public void setCustomerAddressId(int customerAddressId) {
		this.customerAddressId = customerAddressId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + customerAddressId;
		result = prime * result + customerNo;
		result = prime * result
				+ ((emailAddress == null) ? 0 : emailAddress.hashCode());
		result = prime * result + ((firstNm == null) ? 0 : firstNm.hashCode());
		result = prime * result + ((lastNm == null) ? 0 : lastNm.hashCode());
		result = prime * result + mobile;
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
		CustomerId other = (CustomerId) obj;
		if (customerAddressId != other.customerAddressId)
			return false;
		if (customerNo != other.customerNo)
			return false;
		if (emailAddress == null) {
			if (other.emailAddress != null)
				return false;
		} else if (!emailAddress.equals(other.emailAddress))
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
		if (mobile != other.mobile)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "CustomerId [customerNo=" + customerNo + ", firstNm=" + firstNm
				+ ", lastNm=" + lastNm + ", mobile=" + mobile
				+ ", emailAddress=" + emailAddress + ", customerAddressId="
				+ customerAddressId + "]";
	}

	

}
