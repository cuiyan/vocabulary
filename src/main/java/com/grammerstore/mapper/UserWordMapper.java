package com.grammerstore.mapper;

import java.util.List;

import com.grammerstore.entity.DBUserWord;

public interface UserWordMapper {
	/**
	 * 认领单词整理
	 */
	public void addUserWord(DBUserWord userWord);
	
	public List<DBUserWord> selectUserWordByMonth(Integer monthNo);
}
