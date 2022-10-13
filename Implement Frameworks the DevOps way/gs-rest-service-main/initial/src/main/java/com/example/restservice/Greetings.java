package com.example.restservice;

public class Greetings {

	private long id;
	private String content;
	public Greetings(long id, String content) {
		super();
		this.id = id;
		this.content = content;
	}
	public long getId() {
		return id;
	}
	public String getContent() {
		return content;
	}
	
}
