package com.plateno.booking.service;

import com.plateno.booking.model.GsOrderAccount;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
public interface GsOrderAccountService {

	//增加实体
	public int addEntity(GsOrderAccount model) throws Exception;

	//删除实体
	public int deleteEntity(GsOrderAccount model) throws Exception;

	//修改实体
	public int updateEntity(GsOrderAccount model) throws Exception;

	//查询实体
	public GsOrderAccount findEntity(GsOrderAccount model) throws Exception;

	//查询实体List
	public List<GsOrderAccount> findEntityList(GsOrderAccount model) throws Exception;

}
