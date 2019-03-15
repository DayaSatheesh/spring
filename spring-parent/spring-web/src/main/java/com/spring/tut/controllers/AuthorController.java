package com.spring.tut.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.tut.repositories.AuthorRepository;

@Controller
public class AuthorController {

	private AuthorRepository authorRepo;

	public AuthorController(AuthorRepository authorRepo) {
		super();
		this.authorRepo = authorRepo;
	}
	
	@RequestMapping("/authors")
	public String getAuthors(Model model){
		model.addAttribute("authors", authorRepo.findAll());
		return "authors";
	}
}
