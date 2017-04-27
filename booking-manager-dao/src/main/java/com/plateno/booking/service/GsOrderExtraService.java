package com.plateno.booking.service;

import com.plateno.booking.model.GsOrderExtra;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
public interface GsOrderExtraService {

	//增加实体
	public int addEntity(GsOrderExtra model) throws Exception;

	//删除实体
	public int deleteEntity(GsOrderExtra model) throws Exception;

	//修改实体
	public int updateEntity(GsOrderExtra model) throws Exception;

	//查询实体
	public GsOrderExtra findEntity(GsOrderExtra model) throws Exception;

	//查询实体List
	public List<GsOrderExtra> findEntityList(GsOrderExtra model) throws Exception;

}
