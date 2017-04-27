package com.plateno.booking.mapper;

import com.plateno.booking.model.GsOrderInnActivity;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
public interface GsOrderInnActivityMapper {

	public int addEntity(GsOrderInnActivity model);

	public int deleteEntity(GsOrderInnActivity model);

	public int updateEntity(GsOrderInnActivity model);

	public GsOrderInnActivity findEntity(GsOrderInnActivity model);

	public List<GsOrderInnActivity> findEntityList(GsOrderInnActivity model);

}
