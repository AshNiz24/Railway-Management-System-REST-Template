package com.deloitte.pantry.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.pantry.entity.Pantry;

@Repository
public interface PantryRepository extends JpaRepository<Pantry, Integer>{
	
	List<Pantry> findByStnCode(Integer stnCode);

}
