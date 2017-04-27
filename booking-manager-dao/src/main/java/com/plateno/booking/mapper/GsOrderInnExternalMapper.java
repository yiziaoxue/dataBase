package com.plateno.booking.mapper;

import com.plateno.booking.model.GsOrderInnExternal;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
public interface GsOrderInnExternalMapper {

	public int addEntity(GsOrderInnExternal model);

	public int deleteEntity(GsOrderInnExternal model);

	public int updateEntity(GsOrderInnExternal model);

	public GsOrderInnExternal findEntity(GsOrderInnExternal model);

	public List<GsOrderInnExternal> findEntityList(GsOrderInnExternal model);

}
