package com.plateno.booking.service;

import com.plateno.booking.model.SysTimeZone;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:21
 */
public interface SysTimeZoneService {

	//增加实体
	public int addEntity(SysTimeZone model) throws Exception;

	//删除实体
	public int deleteEntity(SysTimeZone model) throws Exception;

	//修改实体
	public int updateEntity(SysTimeZone model) throws Exception;

	//查询实体
	public SysTimeZone findEntity(SysTimeZone model) throws Exception;

	//查询实体List
	public List<SysTimeZone> findEntityList(SysTimeZone model) throws Exception;

}
