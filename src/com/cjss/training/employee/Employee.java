package com.cjss.training.employee;

import java.util.List;

public class Employee {
	private String emp_id;
	private String emp_name;
	private int emp_sal;
	private String loc_id;
	private String dept_id;
//	private String benefit_id;
	private List<Benefits> benefit;

	public List<Benefits> getBenefit() {
		return benefit;
	}

	public void setBenefit(List<Benefits> benefit) {
		this.benefit = benefit;
	}

	public Employee(String emp_id, String emp_name, int emp_sal, String loc_id, String dept_id, List<Benefits> benefit) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_sal = emp_sal;
		this.loc_id = loc_id;
		this.dept_id = dept_id;
		this.benefit = benefit;
	}

	public String getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public int getEmp_sal() {
		return emp_sal;
	}

	public void setEmp_sal(int emp_sal) {
		this.emp_sal = emp_sal;
	}

	public String getLoc_id() {
		return loc_id;
	}

	public void setLoc_id(String loc_id) {
		this.loc_id = loc_id;
	}

	public String getDept_id() {
		return dept_id;
	}

	public void setDept_id(String dept_id) {
		this.dept_id = dept_id;
	}

//	public String getBenefit_id() {
//		return benefit_id;
//	}
//
//	public void setBenefit_id(String benefit_id) {
//		this.benefit_id = benefit_id;
//	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_sal=" + emp_sal + ", loc_id=" + loc_id
				+ ", dept_id=" + dept_id + ", benefits=" + benefit + "]";
	}

}
