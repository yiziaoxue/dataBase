package com.plateno.booking.service;

import com.plateno.booking.model.GsOrderInvoice;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
public interface GsOrderInvoiceService {

	//增加实体
	public int addEntity(GsOrderInvoice model) throws Exception;

	//删除实体
	public int deleteEntity(GsOrderInvoice model) throws Exception;

	//修改实体
	public int updateEntity(GsOrderInvoice model) throws Exception;

	//查询实体
	public GsOrderInvoice findEntity(GsOrderInvoice model) throws Exception;

	//查询实体List
	public List<GsOrderInvoice> findEntityList(GsOrderInvoice model) throws Exception;

}
