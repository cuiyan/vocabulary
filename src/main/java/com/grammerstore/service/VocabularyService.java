package com.grammerstore.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grammerstore.entity.Vocabulary;
import com.grammerstore.mapper.VocabularyMapper;
import com.grammerstore.util.RandomUtil;

@Service
public class VocabularyService {
	@Autowired
	private VocabularyMapper vocabularyMapper;
	
	public List<Vocabulary> selectWordsByTTId(Integer timetableId,Integer page,Integer rows){
		int start = (page-1)*rows;
		List<Vocabulary> listAll = vocabularyMapper.selectWordsByTTId(timetableId,start,rows);
		
		
		
		return listAll;
	}
}
