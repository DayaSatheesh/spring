package com.spring.tut.repositories;

import org.springframework.data.repository.CrudRepository;

import com.spring.tut.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{

}
