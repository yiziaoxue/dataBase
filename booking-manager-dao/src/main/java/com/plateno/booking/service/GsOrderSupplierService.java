package com.plateno.booking.service;

import com.plateno.booking.model.GsOrderSupplier;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:21
 */
public interface GsOrderSupplierService {

	//增加实体
	public int addEntity(GsOrderSupplier model) throws Exception;

	//删除实体
	public int deleteEntity(GsOrderSupplier model) throws Exception;

	//修改实体
	public int updateEntity(GsOrderSupplier model) throws Exception;

	//查询实体
	public GsOrderSupplier findEntity(GsOrderSupplier model) throws Exception;

	//查询实体List
	public List<GsOrderSupplier> findEntityList(GsOrderSupplier model) throws Exception;

}
