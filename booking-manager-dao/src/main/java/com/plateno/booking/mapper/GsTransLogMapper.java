package com.plateno.booking.mapper;

import com.plateno.booking.model.GsTransLog;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
public interface GsTransLogMapper {

	public int addEntity(GsTransLog model);

	public int deleteEntity(GsTransLog model);

	public int updateEntity(GsTransLog model);

	public GsTransLog findEntity(GsTransLog model);

	public List<GsTransLog> findEntityList(GsTransLog model);

}
