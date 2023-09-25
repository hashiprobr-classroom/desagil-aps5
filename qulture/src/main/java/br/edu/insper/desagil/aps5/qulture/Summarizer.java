package br.edu.insper.desagil.aps5.qulture;

import java.util.ArrayList;
import java.util.List;

public class Summarizer {
	private List<Employee> employees;

	public Summarizer(List<Employee> employees, List<Manager> managers) {
		employees = new ArrayList<>();
		employees.addAll(employees);
		employees.addAll(managers);
	}

	public double summarize() {
		double sum = 0;
		for (Employee employee : employees) {
			sum += employee.calculateGrade();
		}
		return sum / employees.size();
	}
}
