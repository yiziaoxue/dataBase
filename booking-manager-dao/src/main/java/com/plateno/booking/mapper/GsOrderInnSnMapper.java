package com.plateno.booking.mapper;

import com.plateno.booking.model.GsOrderInnSn;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
public interface GsOrderInnSnMapper {

	public int addEntity(GsOrderInnSn model);

	public int deleteEntity(GsOrderInnSn model);

	public int updateEntity(GsOrderInnSn model);

	public GsOrderInnSn findEntity(GsOrderInnSn model);

	public List<GsOrderInnSn> findEntityList(GsOrderInnSn model);

}
