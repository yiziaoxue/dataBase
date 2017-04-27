package com.plateno.booking.service;

import com.plateno.booking.model.GsOrderInnExternal;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
public interface GsOrderInnExternalService {

	//增加实体
	public int addEntity(GsOrderInnExternal model) throws Exception;

	//删除实体
	public int deleteEntity(GsOrderInnExternal model) throws Exception;

	//修改实体
	public int updateEntity(GsOrderInnExternal model) throws Exception;

	//查询实体
	public GsOrderInnExternal findEntity(GsOrderInnExternal model) throws Exception;

	//查询实体List
	public List<GsOrderInnExternal> findEntityList(GsOrderInnExternal model) throws Exception;

}
