package com.wl.cgb.ht.ansel.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wl.cgb.ht.ansel.bean.ContactsService;

public interface IContactsServiceDao  extends JpaRepository<ContactsService, Long> {

	public ContactsService findByGoodsBillCode(String goodsBillCode);

}
