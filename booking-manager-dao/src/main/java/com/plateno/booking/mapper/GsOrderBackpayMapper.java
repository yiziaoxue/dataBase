package com.plateno.booking.mapper;

import com.plateno.booking.model.GsOrderBackpay;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
public interface GsOrderBackpayMapper {

	public int addEntity(GsOrderBackpay model);

	public int deleteEntity(GsOrderBackpay model);

	public int updateEntity(GsOrderBackpay model);

	public GsOrderBackpay findEntity(GsOrderBackpay model);

	public List<GsOrderBackpay> findEntityList(GsOrderBackpay model);

}
