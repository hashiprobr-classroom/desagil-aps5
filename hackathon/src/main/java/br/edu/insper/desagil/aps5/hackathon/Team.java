package br.edu.insper.desagil.aps5.hackathon;

import java.util.Map;

public class Team {
	private String name;
	private Map<Integer, Member> members;

	public Team(String name, Map<Integer, Member> members) {
		this.name = name;
		this.members = members;
	}

	public String getName() {
		return name;
	}

	public Map<Integer, Member> getMembers() {
		return members;
	}

	public void submit() {
	}
}
