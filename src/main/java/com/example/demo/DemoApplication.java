package com.example.demo;

import com.example.crudCommand.NoteService;
import com.example.entity.Note;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		NoteService noteService = new NoteService();

	}

}
