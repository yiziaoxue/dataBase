package com.plateno.booking.mapper;

import com.plateno.booking.model.GsOrderInnGuest;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
public interface GsOrderInnGuestMapper {

	public int addEntity(GsOrderInnGuest model);

	public int deleteEntity(GsOrderInnGuest model);

	public int updateEntity(GsOrderInnGuest model);

	public GsOrderInnGuest findEntity(GsOrderInnGuest model);

	public List<GsOrderInnGuest> findEntityList(GsOrderInnGuest model);

}
