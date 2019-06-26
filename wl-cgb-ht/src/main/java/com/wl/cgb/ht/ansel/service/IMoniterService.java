package com.wl.cgb.ht.ansel.service;

import java.util.List;

import com.wl.cgb.ht.ansel.bean.CarCost;
import com.wl.cgb.ht.ansel.bean.ContactsService;
import com.wl.cgb.ht.ansel.bean.CustomerAmount;
import com.wl.cgb.ht.ansel.bean.DriverAmount;
import com.wl.cgb.ht.ansel.bean.GoodsBill;
import com.wl.cgb.ht.ansel.bean.LineOverall;

public interface IMoniterService {

	List<GoodsBill> selectAllUnArrive();

	List<GoodsBill> selectAllUnTake();

	List<CustomerAmount> selectAllCusAcount();

	List<DriverAmount> selectAllDriAcount();

	List<ContactsService> printAllContactsService();

	List<LineOverall> printAllLineOverall();

	List<CarCost> printAllCarCost();

	CarCost selectByCode(String driverCode);

	ContactsService selectByGoodsBillCode(String goodsBillCode);


}
