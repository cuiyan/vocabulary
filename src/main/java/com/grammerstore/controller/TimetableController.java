package com.grammerstore.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.grammerstore.entity.Timetable;
import com.grammerstore.service.TimetableService;

@Controller
public class TimetableController {
	@Autowired
	private TimetableService timetableService;
	
	@RequestMapping(value="/timetable/selectByBookId")
	@ResponseBody
	public List<Timetable> selectByBookId(@RequestParam("bookId")Integer bookId){
		return timetableService.selectByBookId(bookId);
	}
}
