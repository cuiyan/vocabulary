package com.grammerstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.grammerstore.entity.Book;
import com.grammerstore.service.BookService;

@Controller
public class BookController {
	@Autowired
	private BookService bookService;
	
	@RequestMapping(value="/book/selectAll")
	@ResponseBody
	public List<Book> selectAll(){
		return bookService.selectAllBook();
	}
}
