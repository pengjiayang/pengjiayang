package com.wl.cgb.ht.ansel.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wl.cgb.ht.ansel.bean.FinanceFee;

public interface IFinanceFeeDao extends JpaRepository<FinanceFee, Long>{

	public List<FinanceFee> findByPayoutMonth(String PayoutMonth);
}
