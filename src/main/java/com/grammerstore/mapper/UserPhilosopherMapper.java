package com.grammerstore.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.grammerstore.entity.DBUserPhilosopher;
/**
 * 
 * @author cuiyan
 *
 */
public interface UserPhilosopherMapper {
	/**
	 * add the relationships
	 * @param userPhilosopher
	 */
	public void addUserAndPhilosopher(DBUserPhilosopher userPhilosopher);
	/**
	 * modify the relationships
	 * @param userPhilosopher
	 */
	public void modifyUserAndPhilosopher(DBUserPhilosopher userPhilosopher);
	/**
	 * select all relationships
	 * @return
	 */
	public List<DBUserPhilosopher> selectAll();
	/**
	 * select  by id
	 * @return
	 */
	public DBUserPhilosopher selectById(@Param("id")Integer id);
	
	
}
