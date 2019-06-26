package com.wl.cgb.ht.ansel.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wl.cgb.ht.ansel.bean.IncomeMonthlyTemp;

public interface IIncomeMonthlyTempDao extends JpaRepository<IncomeMonthlyTemp, Long>{
	
	public IncomeMonthlyTemp findByMonth(String month);
}
