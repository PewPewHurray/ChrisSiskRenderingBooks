package com.codingdojo.book.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.book.models.Book;
import com.codingdojo.book.repositories.BookRepository;

@Service
public class BookService {
	private final BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	public ArrayList<Book> allbooks(){
		return (ArrayList<Book>) bookRepository.findAll();
	}
	
	public Book createBook(Book b) {
		return bookRepository.save(b);
	}
	
	public Book findBook(Long id) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		if(optionalBook.isPresent()) {
			return optionalBook.get();
		}
		return null;
	}
}
