package com.grammerstore.mapper;

import java.util.List;

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
	 * select all relationships
	 * @return
	 */
	public List<DBUserPhilosopher> selectAll();
}
