package com.am.entities;

import java.util.Date;
import java.util.Set;

public class Invoice implements java.io.Serializable {

	private int invoiceNo;
	private Date invoiceDt;
	private int invoiceAmount;
	private Jobsheet jobsheet;
	private Set<Bill> bills;
	private Set<RepairsConducted> repairsConducteds;
	
	public int getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(int invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public Date getInvoiceDt() {
		return invoiceDt;
	}
	public void setInvoiceDt(Date invoiceDt) {
		this.invoiceDt = invoiceDt;
	}
	public int getInvoiceAmount() {
		return invoiceAmount;
	}
	public void setInvoiceAmount(int invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}
	public Jobsheet getJobsheet() {
		return jobsheet;
	}
	public void setJobsheet(Jobsheet jobsheet) {
		this.jobsheet = jobsheet;
	}
	public Set<Bill> getBills() {
		return bills;
	}
	public void setBills(Set<Bill> bills) {
		this.bills = bills;
	}
	public Set<RepairsConducted> getRepairsConducteds() {
		return repairsConducteds;
	}
	public void setRepairsConducteds(Set<RepairsConducted> repairsConducteds) {
		this.repairsConducteds = repairsConducteds;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + invoiceAmount;
		result = prime * result
				+ ((invoiceDt == null) ? 0 : invoiceDt.hashCode());
		result = prime * result + invoiceNo;
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
		Invoice other = (Invoice) obj;
		if (invoiceAmount != other.invoiceAmount)
			return false;
		if (invoiceDt == null) {
			if (other.invoiceDt != null)
				return false;
		} else if (!invoiceDt.equals(other.invoiceDt))
			return false;
		if (invoiceNo != other.invoiceNo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Invoice [invoiceNo=" + invoiceNo + ", invoiceDt=" + invoiceDt
				+ ", invoiceAmount=" + invoiceAmount + ", jobsheet=" + jobsheet
				+ ", bills=" + bills + ", repairsConducteds="
				+ repairsConducteds + "]";
	}


}
