package com.plateno.booking.mapper;

import com.plateno.booking.model.GsOrderExtra;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
public interface GsOrderExtraMapper {

	public int addEntity(GsOrderExtra model);

	public int deleteEntity(GsOrderExtra model);

	public int updateEntity(GsOrderExtra model);

	public GsOrderExtra findEntity(GsOrderExtra model);

	public List<GsOrderExtra> findEntityList(GsOrderExtra model);

}
