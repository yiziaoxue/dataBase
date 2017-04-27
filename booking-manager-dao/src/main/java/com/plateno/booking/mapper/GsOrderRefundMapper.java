package com.plateno.booking.mapper;

import com.plateno.booking.model.GsOrderRefund;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
public interface GsOrderRefundMapper {

	public int addEntity(GsOrderRefund model);

	public int deleteEntity(GsOrderRefund model);

	public int updateEntity(GsOrderRefund model);

	public GsOrderRefund findEntity(GsOrderRefund model);

	public List<GsOrderRefund> findEntityList(GsOrderRefund model);

}
