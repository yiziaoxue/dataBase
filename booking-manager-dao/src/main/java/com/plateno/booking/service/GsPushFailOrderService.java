package com.plateno.booking.service;

import com.plateno.booking.model.GsPushFailOrder;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:21
 */
public interface GsPushFailOrderService {

	//增加实体
	public int addEntity(GsPushFailOrder model) throws Exception;

	//删除实体
	public int deleteEntity(GsPushFailOrder model) throws Exception;

	//修改实体
	public int updateEntity(GsPushFailOrder model) throws Exception;

	//查询实体
	public GsPushFailOrder findEntity(GsPushFailOrder model) throws Exception;

	//查询实体List
	public List<GsPushFailOrder> findEntityList(GsPushFailOrder model) throws Exception;

}
