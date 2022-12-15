package com.deloitte.railway.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.railway.entity.RailwayStation;


@Repository
public interface RailwayRepository extends JpaRepository<RailwayStation, Integer>{

	
}
