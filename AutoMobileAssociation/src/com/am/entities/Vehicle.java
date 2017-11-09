package com.am.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Vehicle implements java.io.Serializable {
	private int vehicleNo;
	private String vehicleModelNm;
	private String color;
	private Date vehiclePurchaseDt;
	private String chasisNo;
	private String engineNo;
	private String registrationNo;
	private String batteryNo;
	private Set<Jobsheet> jobsheets;
	
	public int getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(int vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public String getVehicleModelNm() {
		return vehicleModelNm;
	}
	public void setVehicleModelNm(String vehicleModelNm) {
		this.vehicleModelNm = vehicleModelNm;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Date getVehiclePurchaseDt() {
		return vehiclePurchaseDt;
	}
	public void setVehiclePurchaseDt(Date vehiclePurchaseDt) {
		this.vehiclePurchaseDt = vehiclePurchaseDt;
	}
	public String getChasisNo() {
		return chasisNo;
	}
	public void setChasisNo(String chasisNo) {
		this.chasisNo = chasisNo;
	}
	public String getEngineNo() {
		return engineNo;
	}
	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}
	public String getRegistrationNo() {
		return registrationNo;
	}
	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}
	public String getBatteryNo() {
		return batteryNo;
	}
	public void setBatteryNo(String batteryNo) {
		this.batteryNo = batteryNo;
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
		result = prime * result
				+ ((batteryNo == null) ? 0 : batteryNo.hashCode());
		result = prime * result
				+ ((chasisNo == null) ? 0 : chasisNo.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result
				+ ((engineNo == null) ? 0 : engineNo.hashCode());
		result = prime * result
				+ ((registrationNo == null) ? 0 : registrationNo.hashCode());
		result = prime * result
				+ ((vehicleModelNm == null) ? 0 : vehicleModelNm.hashCode());
		result = prime * result + vehicleNo;
		result = prime
				* result
				+ ((vehiclePurchaseDt == null) ? 0 : vehiclePurchaseDt
						.hashCode());
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
		Vehicle other = (Vehicle) obj;
		if (batteryNo == null) {
			if (other.batteryNo != null)
				return false;
		} else if (!batteryNo.equals(other.batteryNo))
			return false;
		if (chasisNo == null) {
			if (other.chasisNo != null)
				return false;
		} else if (!chasisNo.equals(other.chasisNo))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (engineNo == null) {
			if (other.engineNo != null)
				return false;
		} else if (!engineNo.equals(other.engineNo))
			return false;
		if (registrationNo == null) {
			if (other.registrationNo != null)
				return false;
		} else if (!registrationNo.equals(other.registrationNo))
			return false;
		if (vehicleModelNm == null) {
			if (other.vehicleModelNm != null)
				return false;
		} else if (!vehicleModelNm.equals(other.vehicleModelNm))
			return false;
		if (vehicleNo != other.vehicleNo)
			return false;
		if (vehiclePurchaseDt == null) {
			if (other.vehiclePurchaseDt != null)
				return false;
		} else if (!vehiclePurchaseDt.equals(other.vehiclePurchaseDt))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Vehicle [vehicleNo=" + vehicleNo + ", vehicleModelNm="
				+ vehicleModelNm + ", color=" + color + ", vehiclePurchaseDt="
				+ vehiclePurchaseDt + ", chasisNo=" + chasisNo + ", engineNo="
				+ engineNo + ", registrationNo=" + registrationNo
				+ ", batteryNo=" + batteryNo + ", jobsheets=" + jobsheets + "]";
	}
	


}
