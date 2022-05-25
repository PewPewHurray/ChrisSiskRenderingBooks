package com.codingdojo.book.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.book.models.Book;
import com.codingdojo.book.services.BookService;

@Controller
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@GetMapping("/books/{id}")
	public String showBook(Model model, @PathVariable()Long id) {
		Book book = bookService.findBook(id);
		model.addAttribute("book", book);
		return "show.jsp";
	}
	
	@PostMapping("/create")
	public String create() {
		Book book = new Book("Twenty Thousand Leagues Under the Seas", "A classic science fiction adventure novel by French writer Jules Verne", "French", 1870);
		bookService.createBook(book);
		return "redirect:index.jsp";
	}
}
