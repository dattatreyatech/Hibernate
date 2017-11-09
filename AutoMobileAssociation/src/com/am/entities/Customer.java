package com.am.entities;

import java.util.Set;

public class Customer implements java.io.Serializable {

	private CustomerId id;
	private Address address;
	private Set<Jobsheet> jobsheets;

	public CustomerId getId() {
		return id;
	}

	public void setId(CustomerId id) {
		this.id = id;
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
	public String toString() {
		return "Customer [id=" + id + ", address=" + address + ", jobsheets="
				+ jobsheets + "]";
	}

}
