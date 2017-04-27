package com.plateno.booking.service;

import com.plateno.booking.model.GsOrderInnGuest;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
public interface GsOrderInnGuestService {

	//增加实体
	public int addEntity(GsOrderInnGuest model) throws Exception;

	//删除实体
	public int deleteEntity(GsOrderInnGuest model) throws Exception;

	//修改实体
	public int updateEntity(GsOrderInnGuest model) throws Exception;

	//查询实体
	public GsOrderInnGuest findEntity(GsOrderInnGuest model) throws Exception;

	//查询实体List
	public List<GsOrderInnGuest> findEntityList(GsOrderInnGuest model) throws Exception;

}
