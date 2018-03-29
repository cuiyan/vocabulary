package com.grammerstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.grammerstore.entity.Vocabulary;
import com.grammerstore.service.VocabularyService;

@Controller
public class VacabularyController {
	@Autowired
	private VocabularyService vocabularyService;
	
	@RequestMapping(value="/vocabulary/selectWordsByTTId")
	@ResponseBody
	public List<Vocabulary> selectWordsByTTId(Integer timetableId,Integer page,Integer rows){
		System.out.println("timetableId:"+timetableId+"==page:"+page+"==rows:"+rows);
		return vocabularyService.selectWordsByTTId(timetableId,page,rows);
	}
}
