package com.plateno.booking.service;

import com.plateno.booking.model.GsOrderLog;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
public interface GsOrderLogService {

	//增加实体
	public int addEntity(GsOrderLog model) throws Exception;

	//删除实体
	public int deleteEntity(GsOrderLog model) throws Exception;

	//修改实体
	public int updateEntity(GsOrderLog model) throws Exception;

	//查询实体
	public GsOrderLog findEntity(GsOrderLog model) throws Exception;

	//查询实体List
	public List<GsOrderLog> findEntityList(GsOrderLog model) throws Exception;

}
