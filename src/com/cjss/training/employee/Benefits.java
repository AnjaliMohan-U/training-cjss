package com.cjss.training.employee;

public class Benefits {
	private String benefit_id;
	private String benefit_name;
	private String benefit_desc;

	public Benefits(String benefit_id, String benefit_name, String benefit_desc) {
		super();
		this.benefit_id = benefit_id;
		this.benefit_name = benefit_name;
		this.benefit_desc = benefit_desc;
	}

	public String getBenefit_id() {
		return benefit_id;
	}

	public void setBenefit_id(String benefit_id) {
		this.benefit_id = benefit_id;
	}

	public String getBenefit_name() {
		return benefit_name;
	}

	public void setBenefit_name(String benefit_name) {
		this.benefit_name = benefit_name;
	}

	public String getBenefit_desc() {
		return benefit_desc;
	}

	public void setBenefit_desc(String benefit_desc) {
		this.benefit_desc = benefit_desc;
	}

	@Override
	public String toString() {
		return "Benefits [benefit_id=" + benefit_id + ", benefit_name=" + benefit_name + ", benefit_desc="
				+ benefit_desc + "]";
	}

}
