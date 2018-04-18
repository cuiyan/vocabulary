package com.grammerstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.grammerstore.entity.DBUserPhilosopher;
import com.grammerstore.service.DigPhilosopherService;

@Controller
public class DigPhilosopherController {
	@Autowired
	private DigPhilosopherService digPhilosopherService;
	
	@RequestMapping(value="/table/claimPhilosopherList")
	@ResponseBody
	public ModelAndView claimPhilosopherList() {
		List<DBUserPhilosopher> list = digPhilosopherService.selectAll();
		return new ModelAndView("/table/claim-philosopher-list").addObject("userPhilosopherList",list);
	}
	@RequestMapping(value="table/claimAPhilosopher")
	@ResponseBody
	public ModelAndView claimAPhilosopher() {
		return new ModelAndView("/table/claim-philosopher");
	}
	
	@RequestMapping(value="table/modifyClaimAPhilosopher")
	@ResponseBody
	public ModelAndView modifyClaimAPhilosopher(Integer id) {
		DBUserPhilosopher userp=digPhilosopherService.selectById(id);
		return new ModelAndView("/table/claim-philosopher").addObject("userPhilosopher", userp);
	}
	
	
	@RequestMapping(value="/table/addUserAndPhilosopher")
	@ResponseBody
	public void addUserAndPhilosopher(DBUserPhilosopher userPhilosopher) {
		
		digPhilosopherService.addOrModifyUserAndPhilosopher(userPhilosopher);
	}
	@RequestMapping(value="/table/selectAll")
	@ResponseBody
	public List<DBUserPhilosopher> selectAll(){
		return digPhilosopherService.selectAll();
	}
}
