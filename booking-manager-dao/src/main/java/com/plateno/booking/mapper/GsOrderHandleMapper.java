package com.plateno.booking.mapper;

import com.plateno.booking.model.GsOrderHandle;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
public interface GsOrderHandleMapper {

	public int addEntity(GsOrderHandle model);

	public int deleteEntity(GsOrderHandle model);

	public int updateEntity(GsOrderHandle model);

	public GsOrderHandle findEntity(GsOrderHandle model);

	public List<GsOrderHandle> findEntityList(GsOrderHandle model);

}
