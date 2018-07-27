package com.capgemini.core.lpg.beans;

public class GasCylinder {
	private String agencyname;
	private String location;
	private int cylindercount;
	public GasCylinder() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GasCylinder(String agencyname, String location, int cylindercount) {
		super();
		this.agencyname = agencyname;
		this.location = location;
		this.cylindercount = cylindercount;
	}
	
	public GasCylinder(String agencyname) {
		super();
		this.agencyname = agencyname;
	}
	public String getAgencyname() {
		return agencyname;
	}
	public void setAgencyname(String agencyname) {
		this.agencyname = agencyname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getCylindercount() {
		return cylindercount;
	}
	public void setCylindercount(int cylindercount) {
		this.cylindercount = cylindercount;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((agencyname == null) ? 0 : agencyname.hashCode());
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
		GasCylinder other = (GasCylinder) obj;
		if (agencyname == null) {
			if (other.agencyname != null)
				return false;
		} else if (!agencyname.equals(other.agencyname))
			return false;
		return true;
	}


}
