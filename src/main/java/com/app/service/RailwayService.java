package com.app.service;

import java.util.List;

import com.app.entity.Railway;

public interface RailwayService {

	
	List<Railway> getAllRailways();
	
	String addRailway(Railway railway);
	
	void deleteById(Long id);
	
	Railway getById(Long id);
	
	Railway getByCategory(Railway railway);
	
	Railway updateById(Railway railway, Long id);
	

}
