package com.spring.tut.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.spring.tut.model.Author;
import com.spring.tut.model.Book;
import com.spring.tut.repositories.AuthorRepository;
import com.spring.tut.repositories.BookRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>{

	private AuthorRepository authorRepo;
	private BookRepository bookRepo;
	
	public DevBootstrap(AuthorRepository authorRepo, BookRepository bookRepo){
		this.authorRepo = authorRepo;
		this.bookRepo = bookRepo;
	}
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		initData();
	}
	
	private void initData(){
		Author a = new Author("Eric", "Evans");
		Book d = new Book("Domain Driven Design", "1234", "Harper Collins");
		
		d.getAuthors().add(a);
		a.getBooks().add(d);
		
		authorRepo.save(a);
		bookRepo.save(d);
		
		Author a1 = new Author("Rod", "Johnson");
		Book d1 = new Book("J2Ee development without EJB", "2344", "Wrox");
		
		d1.getAuthors().add(a1);
		a1.getBooks().add(d1);
		
		authorRepo.save(a1);
		bookRepo.save(d1);
	}

}
