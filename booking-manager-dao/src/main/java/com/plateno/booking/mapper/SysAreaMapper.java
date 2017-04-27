package com.plateno.booking.mapper;

import com.plateno.booking.model.SysArea;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:21
 */
public interface SysAreaMapper {

	public int addEntity(SysArea model);

	public int deleteEntity(SysArea model);

	public int updateEntity(SysArea model);

	public SysArea findEntity(SysArea model);

	public List<SysArea> findEntityList(SysArea model);

}
