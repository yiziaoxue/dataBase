package com.plateno.booking.mapper;

import com.plateno.booking.model.GsOrderInnDay;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
public interface GsOrderInnDayMapper {

	public int addEntity(GsOrderInnDay model);

	public int deleteEntity(GsOrderInnDay model);

	public int updateEntity(GsOrderInnDay model);

	public GsOrderInnDay findEntity(GsOrderInnDay model);

	public List<GsOrderInnDay> findEntityList(GsOrderInnDay model);

}
