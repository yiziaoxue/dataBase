package com.plateno.booking.service;

import com.plateno.booking.model.GsOrderInnDay;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
public interface GsOrderInnDayService {

	//增加实体
	public int addEntity(GsOrderInnDay model) throws Exception;

	//删除实体
	public int deleteEntity(GsOrderInnDay model) throws Exception;

	//修改实体
	public int updateEntity(GsOrderInnDay model) throws Exception;

	//查询实体
	public GsOrderInnDay findEntity(GsOrderInnDay model) throws Exception;

	//查询实体List
	public List<GsOrderInnDay> findEntityList(GsOrderInnDay model) throws Exception;

}
