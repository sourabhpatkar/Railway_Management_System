package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Railway;
import com.app.service.RailwayService;

@RestController
@RequestMapping("/railways")
public class RailwayController {

	@Autowired
	public RailwayService railwayService;

	@GetMapping
	public List<Railway> getAllRailways() {
		return railwayService.getAllRailways();
	}

	@PostMapping
	public String addRail(@RequestBody Railway railway) {
		railwayService.addRailway(railway);
		return "added";
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Long id) {
		railwayService.deleteById(id);
	}
	
	@GetMapping("/{id}")
	public Railway getById(@PathVariable Long id){
		return railwayService.getById(id);
		
	}
}
