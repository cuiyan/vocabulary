package com.grammerstore.service;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grammerstore.entity.DBUserWord;
import com.grammerstore.mapper.UserWordMapper;
import com.grammerstore.util.DateUtil;

@Service
public class UserWordService {
	@Autowired
	 private UserWordMapper userWordMapper;
	
	public void addUserWord(String userName,String operateDate) {
		DBUserWord userWord = new DBUserWord();
		userWord.setUserName(userName);
		try {
			userWord.setOperateDate(DateUtil.parseDate(operateDate, DateUtil.SHORT_FORMATE));
			userWord.setOperateDay(DateUtil.getDayofMonth(operateDate));
			userWord.setOperateMonth(DateUtil.getMonth(operateDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		userWordMapper.addUserWord(userWord);
	}
	
	public List<DBUserWord> selectUserWordByMonth(Integer monthNo){
		List<DBUserWord> list = userWordMapper.selectUserWordByMonth(monthNo);
		list.forEach(userWord->{
			userWord.setOperateYear(DateUtil.getYear(userWord.getOperateDate()));
		});
		return list;
	}
	
	
}
