package com.plateno.booking.service;

import com.plateno.booking.model.GsTransLog;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
public interface GsTransLogService {

	//增加实体
	public int addEntity(GsTransLog model) throws Exception;

	//删除实体
	public int deleteEntity(GsTransLog model) throws Exception;

	//修改实体
	public int updateEntity(GsTransLog model) throws Exception;

	//查询实体
	public GsTransLog findEntity(GsTransLog model) throws Exception;

	//查询实体List
	public List<GsTransLog> findEntityList(GsTransLog model) throws Exception;

}
