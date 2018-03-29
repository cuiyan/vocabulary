package com.grammerstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grammerstore.entity.Timetable;
import com.grammerstore.mapper.TimetableMapper;
import com.grammerstore.util.DateUtil;

@Service
public class TimetableService {
	@Autowired
	private TimetableMapper timetableMapper;
	public List<Timetable> selectByBookId(Integer bookId){
		 List<Timetable> list =timetableMapper.selectByBookId(bookId);
		 list.forEach(timetable->{
			 timetable.setDateTime(DateUtil.formateDate(timetable.getTime(), DateUtil.SHORT_FORMATE));
		 });
		 return list;
	}
}
