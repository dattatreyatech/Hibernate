package com.am.entities;

public class JobsheetMechanic implements java.io.Serializable {

	private JobsheetMechanicId id;
	private int duration;
	private String comments;
	private Jobsheet jobsheet;
	private Mechanic mechanic;

	public JobsheetMechanicId getId() {
		return id;
	}

	public void setId(JobsheetMechanicId id) {
		this.id = id;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Jobsheet getJobsheet() {
		return jobsheet;
	}

	public void setJobsheet(Jobsheet jobsheet) {
		this.jobsheet = jobsheet;
	}

	public Mechanic getMechanic() {
		return mechanic;
	}

	public void setMechanic(Mechanic mechanic) {
		this.mechanic = mechanic;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((comments == null) ? 0 : comments.hashCode());
		result = prime * result + duration;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		JobsheetMechanic other = (JobsheetMechanic) obj;
		if (comments == null) {
			if (other.comments != null)
				return false;
		} else if (!comments.equals(other.comments))
			return false;
		if (duration != other.duration)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "JobsheetMechanic [id=" + id + ", duration=" + duration
				+ ", comments=" + comments + ", jobsheet=" + jobsheet
				+ ", mechanic=" + mechanic + "]";
	}

}
