package com.wl.cgb.ht.ansel.service;

import java.util.List;

import com.wl.cgb.ht.ansel.bean.RouteInfo;

public interface IRouteService {
	
	public void generateRoute();
	
	public List<RouteInfo> findAllRouteInfos();

}
