package com.plateno.booking.mapper;

import com.plateno.booking.model.GsPushFailOrder;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:21
 */
public interface GsPushFailOrderMapper {

	public int addEntity(GsPushFailOrder model);

	public int deleteEntity(GsPushFailOrder model);

	public int updateEntity(GsPushFailOrder model);

	public GsPushFailOrder findEntity(GsPushFailOrder model);

	public List<GsPushFailOrder> findEntityList(GsPushFailOrder model);

}
