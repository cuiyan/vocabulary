package com.grammerstore.mapper;

import java.util.List;

import com.grammerstore.entity.Book;

public interface BookMapper {
	public List<Book> selectAll();
}
