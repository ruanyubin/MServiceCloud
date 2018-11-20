package com.ruanyb.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ruanyb.springcloud.entities.Dept;

@Mapper
public interface DeptDao {
	
	public Dept findById(Long id);
	
	public boolean addDept(Dept dept);
	
	public List<Dept> findAll();
	
}
