package com.plateno.booking.mapper;

import com.plateno.booking.model.GsOrderBackpayLog;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
public interface GsOrderBackpayLogMapper {

	public int addEntity(GsOrderBackpayLog model);

	public int deleteEntity(GsOrderBackpayLog model);

	public int updateEntity(GsOrderBackpayLog model);

	public GsOrderBackpayLog findEntity(GsOrderBackpayLog model);

	public List<GsOrderBackpayLog> findEntityList(GsOrderBackpayLog model);

}
