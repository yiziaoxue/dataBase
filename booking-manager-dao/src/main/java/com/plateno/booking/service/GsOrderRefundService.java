package com.plateno.booking.service;

import com.plateno.booking.model.GsOrderRefund;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
public interface GsOrderRefundService {

	//增加实体
	public int addEntity(GsOrderRefund model) throws Exception;

	//删除实体
	public int deleteEntity(GsOrderRefund model) throws Exception;

	//修改实体
	public int updateEntity(GsOrderRefund model) throws Exception;

	//查询实体
	public GsOrderRefund findEntity(GsOrderRefund model) throws Exception;

	//查询实体List
	public List<GsOrderRefund> findEntityList(GsOrderRefund model) throws Exception;

}
