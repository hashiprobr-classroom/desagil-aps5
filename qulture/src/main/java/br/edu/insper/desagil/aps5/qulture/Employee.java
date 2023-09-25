package br.edu.insper.desagil.aps5.qulture;

public class Employee {
	private int id;
	private String name;
	private double grade;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
		this.grade = 0;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public double calculateGrade() {
		return grade;
	}
}
