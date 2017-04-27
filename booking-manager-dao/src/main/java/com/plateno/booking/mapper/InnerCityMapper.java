package com.plateno.booking.mapper;

import com.plateno.booking.model.InnerCity;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:21
 */
public interface InnerCityMapper {

	public int addEntity(InnerCity model);

	public int deleteEntity(InnerCity model);

	public int updateEntity(InnerCity model);

	public InnerCity findEntity(InnerCity model);

	public List<InnerCity> findEntityList(InnerCity model);

}
