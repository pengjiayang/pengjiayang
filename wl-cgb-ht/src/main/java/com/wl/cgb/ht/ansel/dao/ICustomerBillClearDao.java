package com.wl.cgb.ht.ansel.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wl.cgb.ht.ansel.bean.CustomerBillClear;

public interface ICustomerBillClearDao extends JpaRepository<CustomerBillClear, Long> {
	
	
	public CustomerBillClear findByGoodsBillCode(String billCode);



}