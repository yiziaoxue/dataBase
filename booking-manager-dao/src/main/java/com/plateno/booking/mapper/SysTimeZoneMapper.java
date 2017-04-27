package com.plateno.booking.mapper;

import com.plateno.booking.model.SysTimeZone;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:21
 */
public interface SysTimeZoneMapper {

	public int addEntity(SysTimeZone model);

	public int deleteEntity(SysTimeZone model);

	public int updateEntity(SysTimeZone model);

	public SysTimeZone findEntity(SysTimeZone model);

	public List<SysTimeZone> findEntityList(SysTimeZone model);

}
