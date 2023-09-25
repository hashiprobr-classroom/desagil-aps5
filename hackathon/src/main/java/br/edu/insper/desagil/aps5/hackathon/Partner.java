package br.edu.insper.desagil.aps5.hackathon;

public class Partner {
	private int id;
	private Event event;

	public Partner(int id, Event event) {
		this.id = id;
		this.event = event;
	}

	public int getId() {
		return id;
	}

	public Event getEvent() {
		return event;
	}

	public void review() {
	}
}
