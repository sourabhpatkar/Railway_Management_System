package com.app.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Railway;
import com.app.repository.RailwayRepository;

@Service
@Transactional
public class RailwayServiceImplementation implements RailwayService {
	
	@Autowired
	public RailwayRepository railwayRepository;
	
	@Override
	public List<Railway> getAllRailways() {
		
		return railwayRepository.findAll();
	}

	@Override
	public String addRailway(Railway railway) {
		railwayRepository.save(railway);
		return "added";
	}

	@Override
	public void deleteById(Long id) {
		railwayRepository.deleteById(id);
	}

	@Override
	public Railway getById(Long id) {
		Optional<Railway> findById = railwayRepository.findById(id);
		Railway railway = findById.get();
		return railway;
	}

	@Override
	public Railway getByCategory(Railway railway) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Railway updateById(Railway railway, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
