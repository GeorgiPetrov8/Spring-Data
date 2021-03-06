package com.example.demo.controllers;

import com.example.demo.services.AuthorService;
import com.example.demo.services.BookService;
import com.example.demo.services.CategoryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;


@Controller
public class AppController implements CommandLineRunner {

    private final CategoryService categoryService;
    private final AuthorService authorService;
    private final BookService bookService;

    public AppController(CategoryService categoryService, AuthorService authorService, BookService bookService) {
        this.categoryService = categoryService;
        this.authorService = authorService;
        this.bookService = bookService;
    }

    @Override
    public void run(String... args) throws Exception {
//        this.categoryService.seedCategories();
//        this.authorService.seedAuthor();
//        this.bookService.seedBook();

//        this.bookService.getAllBooksAfter2000();
        this.authorService.getAllAuthorsWithBookBefore1990();

    }
}
