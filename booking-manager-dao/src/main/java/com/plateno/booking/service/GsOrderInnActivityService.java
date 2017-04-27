package com.plateno.booking.service;

import com.plateno.booking.model.GsOrderInnActivity;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
public interface GsOrderInnActivityService {

	//增加实体
	public int addEntity(GsOrderInnActivity model) throws Exception;

	//删除实体
	public int deleteEntity(GsOrderInnActivity model) throws Exception;

	//修改实体
	public int updateEntity(GsOrderInnActivity model) throws Exception;

	//查询实体
	public GsOrderInnActivity findEntity(GsOrderInnActivity model) throws Exception;

	//查询实体List
	public List<GsOrderInnActivity> findEntityList(GsOrderInnActivity model) throws Exception;

}
