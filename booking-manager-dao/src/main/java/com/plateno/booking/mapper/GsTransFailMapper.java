package com.plateno.booking.mapper;

import com.plateno.booking.model.GsTransFail;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:21
 */
public interface GsTransFailMapper {

	public int addEntity(GsTransFail model);

	public int deleteEntity(GsTransFail model);

	public int updateEntity(GsTransFail model);

	public GsTransFail findEntity(GsTransFail model);

	public List<GsTransFail> findEntityList(GsTransFail model);

}
