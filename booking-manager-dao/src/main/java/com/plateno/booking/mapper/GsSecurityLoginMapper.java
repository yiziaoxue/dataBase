package com.plateno.booking.mapper;

import com.plateno.booking.model.GsSecurityLogin;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:21
 */
public interface GsSecurityLoginMapper {

	public int addEntity(GsSecurityLogin model);

	public int deleteEntity(GsSecurityLogin model);

	public int updateEntity(GsSecurityLogin model);

	public GsSecurityLogin findEntity(GsSecurityLogin model);

	public List<GsSecurityLogin> findEntityList(GsSecurityLogin model);

}
