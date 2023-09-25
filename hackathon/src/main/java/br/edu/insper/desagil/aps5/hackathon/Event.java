package br.edu.insper.desagil.aps5.hackathon;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Event {
	private String name;
	private LocalDate date;
	private List<Team> teams;

	public Event(String name, LocalDate date, List<Team> teams) {
		this.name = name;
		this.date = date;
		this.teams = teams;
	}

	public String getName() {
		return name;
	}

	public LocalDate getDate() {
		return date;
	}

	public List<Team> getTeams() {
		return teams;
	}

	public void addTeam(String name, Map<Integer, Member> members) {
		teams.add(new Team(name, members));
	}
}
