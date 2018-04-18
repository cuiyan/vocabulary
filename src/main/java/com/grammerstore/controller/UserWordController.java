package com.grammerstore.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.grammerstore.entity.DBUserWord;
import com.grammerstore.service.UserWordService;
import com.grammerstore.util.DateUtil;

@Controller
public class UserWordController {
	@Autowired
	private UserWordService userWordService;
	
	@RequestMapping(value="/claim-word/addUserWord")
	@ResponseBody
	public void addUserWord(@RequestParam("userName")String userName,@RequestParam("operateDate")String operateDate) {
		
		userWordService.addUserWord(userName,operateDate);
	}
	@RequestMapping(value="/claim-word/selectUserWordByMonth")
	@ResponseBody
	public List<DBUserWord> selectUserWordByMonth(@RequestParam("monthNo")Integer monthNo){
		return userWordService.selectUserWordByMonth(monthNo);
	}
}
