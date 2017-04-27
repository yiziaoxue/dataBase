package com.plateno.booking.service;

import java.util.List;

import com.plateno.booking.model.GsOrderInn;
import com.plateno.booking.param.OrderInnParam;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
public interface GsOrderInnService {

	//增加实体
	public int addEntity(GsOrderInn model) throws Exception;

	//删除实体
	public int deleteEntity(GsOrderInn model) throws Exception;

	//修改实体
	public int updateEntity(GsOrderInn model) throws Exception;

	//查询实体
	public GsOrderInn findEntity(GsOrderInn model) throws Exception;

	//查询实体List
	public List<GsOrderInn> findEntityList(OrderInnParam model) throws Exception;

	public GsOrderInn getBkMebIdByOrderCode(GsOrderInn model) throws Exception;
	
}
