package com.wl.cgb.ht.ansel.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.wl.cgb.ht.ansel.bean.CustomerInfo;


public interface ICustomerDao  extends JpaRepository<CustomerInfo, Long> {
	
	public CustomerInfo findByCustomerCode(String customerCode);
	
	@Query(value = "select customerCode from customerinfo")
	public List<String> findAllCustomerCode();

}
