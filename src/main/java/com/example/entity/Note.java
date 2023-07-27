package com.example.entity;


import lombok.Data;
@Data
public class Note {
	private final long id = generateId();
	private String title;
	private String content;

	private long generateId(){
		long leftLimit = 1L;
		long rightLimit = 10L;
		return leftLimit + (long) (Math.random() * (rightLimit - leftLimit));
	}
}
