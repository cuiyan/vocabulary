package com.grammerstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grammerstore.entity.Book;
import com.grammerstore.mapper.BookMapper;

@Service
public class BookService {
	@Autowired
	private BookMapper bookMapper;
	
	public List<Book> selectAllBook(){
		return bookMapper.selectAll();
	}
}
