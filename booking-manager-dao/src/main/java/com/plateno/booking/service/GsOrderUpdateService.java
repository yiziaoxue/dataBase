package com.plateno.booking.service;

import com.plateno.booking.model.GsOrderUpdate;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
public interface GsOrderUpdateService {

	//增加实体
	public int addEntity(GsOrderUpdate model) throws Exception;

	//删除实体
	public int deleteEntity(GsOrderUpdate model) throws Exception;

	//修改实体
	public int updateEntity(GsOrderUpdate model) throws Exception;

	//查询实体
	public GsOrderUpdate findEntity(GsOrderUpdate model) throws Exception;

	//查询实体List
	public List<GsOrderUpdate> findEntityList(GsOrderUpdate model) throws Exception;

}
