package com.grammerstore.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.grammerstore.entity.Timetable;

public interface TimetableMapper {
	public List<Timetable> selectByBookId(@Param("bookId")Integer bookId) ;
}
