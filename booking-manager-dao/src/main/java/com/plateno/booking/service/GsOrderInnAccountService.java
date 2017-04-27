package com.plateno.booking.service;

import com.plateno.booking.model.GsOrderInnAccount;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
public interface GsOrderInnAccountService {

	//增加实体
	public int addEntity(GsOrderInnAccount model) throws Exception;

	//删除实体
	public int deleteEntity(GsOrderInnAccount model) throws Exception;

	//修改实体
	public int updateEntity(GsOrderInnAccount model) throws Exception;

	//查询实体
	public GsOrderInnAccount findEntity(GsOrderInnAccount model) throws Exception;

	//查询实体List
	public List<GsOrderInnAccount> findEntityList(GsOrderInnAccount model) throws Exception;

}
