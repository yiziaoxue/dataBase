package com.plateno.booking.service;

import com.plateno.booking.model.GsOrderHandle;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
public interface GsOrderHandleService {

	//增加实体
	public int addEntity(GsOrderHandle model) throws Exception;

	//删除实体
	public int deleteEntity(GsOrderHandle model) throws Exception;

	//修改实体
	public int updateEntity(GsOrderHandle model) throws Exception;

	//查询实体
	public GsOrderHandle findEntity(GsOrderHandle model) throws Exception;

	//查询实体List
	public List<GsOrderHandle> findEntityList(GsOrderHandle model) throws Exception;

}
