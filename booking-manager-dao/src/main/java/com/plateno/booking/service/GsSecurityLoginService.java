package com.plateno.booking.service;

import com.plateno.booking.model.GsSecurityLogin;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:21
 */
public interface GsSecurityLoginService {

	//增加实体
	public int addEntity(GsSecurityLogin model) throws Exception;

	//删除实体
	public int deleteEntity(GsSecurityLogin model) throws Exception;

	//修改实体
	public int updateEntity(GsSecurityLogin model) throws Exception;

	//查询实体
	public GsSecurityLogin findEntity(GsSecurityLogin model) throws Exception;

	//查询实体List
	public List<GsSecurityLogin> findEntityList(GsSecurityLogin model) throws Exception;

}
