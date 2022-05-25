package com.codingdojo.book.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.book.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long>{
	
}
