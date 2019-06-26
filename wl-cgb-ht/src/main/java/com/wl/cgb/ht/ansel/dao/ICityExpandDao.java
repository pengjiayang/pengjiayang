package com.wl.cgb.ht.ansel.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wl.cgb.ht.ansel.bean.CityExpand;

public interface ICityExpandDao extends JpaRepository<CityExpand, Long> {
	
	public CityExpand findByCityId(int cityId);
	
	public CityExpand findById(int id);

}
