package com.plateno.booking.mapper;

import com.plateno.booking.model.GsOrderUpdate;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
public interface GsOrderUpdateMapper {

	public int addEntity(GsOrderUpdate model);

	public int deleteEntity(GsOrderUpdate model);

	public int updateEntity(GsOrderUpdate model);

	public GsOrderUpdate findEntity(GsOrderUpdate model);

	public List<GsOrderUpdate> findEntityList(GsOrderUpdate model);

}
