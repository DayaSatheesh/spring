package com.spring.tut.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.tut.repositories.BookRepository;

@Controller
public class BookController {
	
	private BookRepository bookRepo;

	public BookController(BookRepository bookRepo) {
		super();
		this.bookRepo = bookRepo;
	}
	
	@RequestMapping("/books")
	public String getBooks(Model model){
		
		model.addAttribute("books", bookRepo.findAll());
		return "books";		
	}
	
	

}
