package com.wl.cgb.ht.ansel.service;

import com.wl.cgb.ht.ansel.bean.CallbackInfo;

public interface ICallbackService {
	
	public boolean addInfo(CallbackInfo callbackInfo);
	
	public CallbackInfo findDetail(String goodsBillId, String type);

}
