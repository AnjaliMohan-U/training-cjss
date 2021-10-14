package com.cjss.training.employee;

public class Location {
	private String loc_id;
	private String loc_name;
	private String loc_country;

	public Location(String loc_id, String loc_name, String loc_country) {
		super();
		this.loc_id = loc_id;
		this.loc_name = loc_name;
		this.loc_country = loc_country;
	}

	public String getLoc_id() {
		return loc_id;
	}

	public void setLoc_id(String loc_id) {
		this.loc_id = loc_id;
	}

	public String getLoc_name() {
		return loc_name;
	}

	public void setLoc_name(String loc_name) {
		this.loc_name = loc_name;
	}

	public String getLoc_country() {
		return loc_country;
	}

	public void setLoc_country(String loc_country) {
		this.loc_country = loc_country;
	}

	@Override
	public String toString() {
		return "Location [loc_id=" + loc_id + ", loc_name=" + loc_name + ", loc_country=" + loc_country + "]";
	}

}
