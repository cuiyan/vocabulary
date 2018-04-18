package com.grammerstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grammerstore.entity.DBUserPhilosopher;
import com.grammerstore.mapper.UserPhilosopherMapper;

@Service
public class DigPhilosopherService {
	@Autowired
	private UserPhilosopherMapper userPhilosopherMapper;
	
	/**
	 * add the relationships
	 * @param userPhilosopher
	 */
	public void addOrModifyUserAndPhilosopher(DBUserPhilosopher userPhilosopher) {
		if(userPhilosopher.getId()!=null && userPhilosopher.getId()!=0) {
			userPhilosopherMapper.modifyUserAndPhilosopher(userPhilosopher);
		}else {
			userPhilosopherMapper.addUserAndPhilosopher(userPhilosopher);
		}
	}
	/**
	 * select all relationships
	 * @return
	 */
	public List<DBUserPhilosopher> selectAll(){
		return userPhilosopherMapper.selectAll();
	}
	/**
	 * select all relationships
	 * @return
	 */
	public DBUserPhilosopher selectById(Integer id){
		return userPhilosopherMapper.selectById(id);
	}
	
	
}
