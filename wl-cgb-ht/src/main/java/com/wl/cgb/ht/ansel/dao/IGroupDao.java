package com.wl.cgb.ht.ansel.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wl.cgb.ht.ansel.bean.UserGroup;

public interface IGroupDao extends JpaRepository<UserGroup, Long> {
	
	public UserGroup findByGroupName(String groupName);
	
	public UserGroup findById(int id);
	
}
