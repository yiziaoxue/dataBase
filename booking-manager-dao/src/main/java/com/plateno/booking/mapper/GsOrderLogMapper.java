package com.plateno.booking.mapper;

import com.plateno.booking.model.GsOrderLog;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
public interface GsOrderLogMapper {

	public int addEntity(GsOrderLog model);

	public int deleteEntity(GsOrderLog model);

	public int updateEntity(GsOrderLog model);

	public GsOrderLog findEntity(GsOrderLog model);

	public List<GsOrderLog> findEntityList(GsOrderLog model);

}
