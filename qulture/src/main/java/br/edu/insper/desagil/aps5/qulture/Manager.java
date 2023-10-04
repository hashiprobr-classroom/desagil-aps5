package br.edu.insper.desagil.aps5.qulture;

import java.util.HashMap;
import java.util.Map;

public class Manager extends Employee {
	private Map<String, Employee> managed;

	public Manager(int id, String name) {
		super(id, name);
		this.managed = new HashMap<>();
	}

	public Map<String, Employee> getManaged() {
		return managed;
	}

	public void addManaged(String position, Employee employee) {
		managed.put(position, employee);
	}

	public void removeManaged(String position) {
		managed.remove(position);
	}

	public void evaluate(String position, double grade) {
		managed.get(position).setGrade(grade);
	}

	@Override
	public double calculateGrade() {
		return (getGrade() + managedGrade()) / 2;
	}

	private double managedGrade() {
		double managedSum = 0;
		if (!managed.isEmpty()) {
			for (Employee employee : managed.values()) {
				managedSum += employee.getGrade();
			}
		}
		return managedSum / managed.size();
	}
}
