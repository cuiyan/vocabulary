package com.grammerstore.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.grammerstore.entity.Vocabulary;

@Service
public interface VocabularyMapper {
	public List<Vocabulary> selectWordsByTTId(@Param("timetableId")Integer timetableId,@Param("start")Integer start,@Param("rows")Integer rows);
}
