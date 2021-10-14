package com.cjss.training.students;
public class StudentFee {
	private String rno;
	private double amount;
	

	public StudentFee(String rno, double amount) {
		super();
		this.rno = rno;
		this.amount = amount;
	}

	public String getRno() {
		return rno;
	}

	public void setRno(String rno) {
		this.rno = rno;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "StudentFee [rno=" + rno + ", amount=" + amount + "]";
	}
	
}