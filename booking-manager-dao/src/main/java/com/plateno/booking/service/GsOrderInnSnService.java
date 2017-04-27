package com.plateno.booking.service;

import com.plateno.booking.model.GsOrderInnSn;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
public interface GsOrderInnSnService {

	//增加实体
	public int addEntity(GsOrderInnSn model) throws Exception;

	//删除实体
	public int deleteEntity(GsOrderInnSn model) throws Exception;

	//修改实体
	public int updateEntity(GsOrderInnSn model) throws Exception;

	//查询实体
	public GsOrderInnSn findEntity(GsOrderInnSn model) throws Exception;

	//查询实体List
	public List<GsOrderInnSn> findEntityList(GsOrderInnSn model) throws Exception;

}
