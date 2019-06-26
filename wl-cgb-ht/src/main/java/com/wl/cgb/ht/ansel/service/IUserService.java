package com.wl.cgb.ht.ansel.service;

import java.util.Map;

public interface IUserService {
	
	public Map<?, ?> userLogin(String loginId, String password);
	
	public boolean ifExist(String loginId);
	
	public boolean changePassword(String loginId, String oldPassword, String newPassword);

}
