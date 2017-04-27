package com.plateno.booking.mapper;

import java.util.List;

import com.plateno.booking.bean.GetOrderDetailParam;
import com.plateno.booking.model.GsOrderInn;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
public interface GsOrderInnMapper {

	public int addEntity(GsOrderInn model);

	public int deleteEntity(GsOrderInn model);

	public int updateEntity(GsOrderInn model);

	public GsOrderInn findEntity(GsOrderInn model);

	public List<GsOrderInn> findEntityList(GsOrderInn model);
	
	//订单表分页查询
	public List<GsOrderInn> findEntityListByPage(GetOrderDetailParam model);

	public GsOrderInn getBkMebIdByOrderCode(GsOrderInn model);
}
