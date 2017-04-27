package com.plateno.booking.mapper;

import com.plateno.booking.model.GsOrderInvoice;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
public interface GsOrderInvoiceMapper {

	public int addEntity(GsOrderInvoice model);

	public int deleteEntity(GsOrderInvoice model);

	public int updateEntity(GsOrderInvoice model);

	public GsOrderInvoice findEntity(GsOrderInvoice model);

	public List<GsOrderInvoice> findEntityList(GsOrderInvoice model);

}
