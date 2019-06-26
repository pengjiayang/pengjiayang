package com.wl.cgb.ht.ansel.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.wl.cgb.ht.ansel.bean.ProxyFeeClear;

public interface IProxyFeeClearDao extends JpaRepository<ProxyFeeClear, Long> {
	
	public ProxyFeeClear findByGoodsBillCode(String goodsBillCode);
	
	
	
}