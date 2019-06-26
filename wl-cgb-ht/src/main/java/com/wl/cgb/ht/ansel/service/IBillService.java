package com.wl.cgb.ht.ansel.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wl.cgb.ht.ansel.bean.BillInfo;
import com.wl.cgb.ht.ansel.bean.BillRelease;
import com.wl.cgb.ht.ansel.bean.GoodsReceiptInfo;

public interface IBillService {
	
	public Page<BillInfo> findAllByPage(Pageable pageable);
	
	public Page<BillInfo> findNotRelease(Pageable pageable);
	
	public boolean addRelease(BillRelease billRelease);
	
	public boolean addGoodsReceipt(GoodsReceiptInfo goodsReceiptInfo);

}
