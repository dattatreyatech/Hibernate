package com.am.entities;

import java.util.Date;

public class Bill implements java.io.Serializable {

	private int billNo;
	private Date billDt;
	private int amount;
	private int discount;
	private int netAmount;
	private String paymentType;
	private Invoice invoice;
	public int getBillNo() {
		return billNo;
	}
	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}
	public Date getBillDt() {
		return billDt;
	}
	public void setBillDt(Date billDt) {
		this.billDt = billDt;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getNetAmount() {
		return netAmount;
	}
	public void setNetAmount(int netAmount) {
		this.netAmount = netAmount;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public Invoice getInvoice() {
		return invoice;
	}
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		result = prime * result + ((billDt == null) ? 0 : billDt.hashCode());
		result = prime * result + billNo;
		result = prime * result + discount;
		result = prime * result + netAmount;
		result = prime * result
				+ ((paymentType == null) ? 0 : paymentType.hashCode());
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
		Bill other = (Bill) obj;
		if (amount != other.amount)
			return false;
		if (billDt == null) {
			if (other.billDt != null)
				return false;
		} else if (!billDt.equals(other.billDt))
			return false;
		if (billNo != other.billNo)
			return false;
		if (discount != other.discount)
			return false;
		if (netAmount != other.netAmount)
			return false;
		if (paymentType == null) {
			if (other.paymentType != null)
				return false;
		} else if (!paymentType.equals(other.paymentType))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Bill [billNo=" + billNo + ", billDt=" + billDt + ", amount="
				+ amount + ", discount=" + discount + ", netAmount="
				+ netAmount + ", paymentType=" + paymentType + ", invoice="
				+ invoice + "]";
	}



}
