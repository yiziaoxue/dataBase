package com.plateno.booking.service;

import com.plateno.booking.model.InnerCity;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:21
 */
public interface InnerCityService {

	//增加实体
	public int addEntity(InnerCity model) throws Exception;

	//删除实体
	public int deleteEntity(InnerCity model) throws Exception;

	//修改实体
	public int updateEntity(InnerCity model) throws Exception;

	//查询实体
	public InnerCity findEntity(InnerCity model) throws Exception;

	//查询实体List
	public List<InnerCity> findEntityList(InnerCity model) throws Exception;

}
