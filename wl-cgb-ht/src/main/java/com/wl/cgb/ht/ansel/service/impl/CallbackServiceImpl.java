package com.wl.cgb.ht.ansel.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.wl.cgb.ht.ansel.bean.CallbackInfo;
import com.wl.cgb.ht.ansel.dao.ICallbackDao;
import com.wl.cgb.ht.ansel.service.ICallbackService;

@Transactional(propagation = Propagation.REQUIRED)
@Service(value = "callbackService")
public class CallbackServiceImpl implements ICallbackService {
	
	@Autowired
	private ICallbackDao callbackDao;

	@Override
	public boolean addInfo(CallbackInfo callbackInfo) {
		// TODO Auto-generated method stub
		try {
			callbackDao.save(callbackInfo);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.err.println("插入回告失败");
			return false;
		}
	}

	@Override
	public CallbackInfo findDetail(String goodsBillId, String type) {
		// TODO Auto-generated method stub
		return callbackDao.findByGoodsBillIdAndType(goodsBillId, type);
	}

}
