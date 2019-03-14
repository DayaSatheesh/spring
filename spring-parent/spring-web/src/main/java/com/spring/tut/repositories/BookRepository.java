package com.spring.tut.repositories;

import org.springframework.data.repository.CrudRepository;

import com.spring.tut.model.Book;

public interface BookRepository extends CrudRepository<Book, Long>{

}
