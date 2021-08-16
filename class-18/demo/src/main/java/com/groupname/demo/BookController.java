package com.groupname.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController {

    @Autowired
    BookRepository bookRepository;
    @Autowired
    AuthorRepository authorRepository;

    @GetMapping("/book")
    public String getBooks(Model model){
//        Book harryPotter = new Book(1,"J.K Rowlling", "Harry Potter and the prisoner of Azkaban");
//        Book digitalFortress = new Book(2, "Dan Brown","Digital Fortress");
//        List<Book> books = new ArrayList<Book>();
//        books.add(harryPotter);
//        books.add(digitalFortress);

        model.addAttribute("books",bookRepository.findAll());
        return "books.html";
    }

    // post request
    @GetMapping("/addbook") // this should be a post, we are just adding it as get to run the function without using a form
    public RedirectView addBook(/* object of type book / its data + author id*/){    // pick an author
        Author author = authorRepository.findById(1).get();  // added as 1 just for speed - usually we retrieve it from the data
       // Book book = new Book(author,"Book title test");
       // bookRepository.save(book);
        return new RedirectView("/book");
//        Book book = new Book("J.K Rowlling","Harry Potter and the prisoner of Azkaban");
//        bookRepository.save(book);
//        return new RedirectView("/book");
    }

}
