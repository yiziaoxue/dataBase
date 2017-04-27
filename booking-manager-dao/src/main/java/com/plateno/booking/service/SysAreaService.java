package com.plateno.booking.service;

import com.plateno.booking.model.SysArea;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:21
 */
public interface SysAreaService {

	//增加实体
	public int addEntity(SysArea model) throws Exception;

	//删除实体
	public int deleteEntity(SysArea model) throws Exception;

	//修改实体
	public int updateEntity(SysArea model) throws Exception;

	//查询实体
	public SysArea findEntity(SysArea model) throws Exception;

	//查询实体List
	public List<SysArea> findEntityList(SysArea model) throws Exception;

}
