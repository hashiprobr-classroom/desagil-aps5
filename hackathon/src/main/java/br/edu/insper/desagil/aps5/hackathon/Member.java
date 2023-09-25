package br.edu.insper.desagil.aps5.hackathon;

public class Member {
	private String login;
	private String name;

	public Member(String login, String name) {
		this.login = login;
		this.name = name;
	}

	public String getLogin() {
		return login;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
