package com.plateno.booking.service;

import com.plateno.booking.model.GsOrderBackpayLog;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
public interface GsOrderBackpayLogService {

	//增加实体
	public int addEntity(GsOrderBackpayLog model) throws Exception;

	//删除实体
	public int deleteEntity(GsOrderBackpayLog model) throws Exception;

	//修改实体
	public int updateEntity(GsOrderBackpayLog model) throws Exception;

	//查询实体
	public GsOrderBackpayLog findEntity(GsOrderBackpayLog model) throws Exception;

	//查询实体List
	public List<GsOrderBackpayLog> findEntityList(GsOrderBackpayLog model) throws Exception;

}
