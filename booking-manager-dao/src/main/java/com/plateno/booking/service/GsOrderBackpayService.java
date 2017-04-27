package com.plateno.booking.service;

import com.plateno.booking.model.GsOrderBackpay;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
public interface GsOrderBackpayService {

	//增加实体
	public int addEntity(GsOrderBackpay model) throws Exception;

	//删除实体
	public int deleteEntity(GsOrderBackpay model) throws Exception;

	//修改实体
	public int updateEntity(GsOrderBackpay model) throws Exception;

	//查询实体
	public GsOrderBackpay findEntity(GsOrderBackpay model) throws Exception;

	//查询实体List
	public List<GsOrderBackpay> findEntityList(GsOrderBackpay model) throws Exception;

}
