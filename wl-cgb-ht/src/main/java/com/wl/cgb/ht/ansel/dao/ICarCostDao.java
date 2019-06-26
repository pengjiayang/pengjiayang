package com.wl.cgb.ht.ansel.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wl.cgb.ht.ansel.bean.CarCost;

public interface ICarCostDao extends JpaRepository<CarCost, Long>{

	public CarCost findByDriverCode(String driverCode);


}
