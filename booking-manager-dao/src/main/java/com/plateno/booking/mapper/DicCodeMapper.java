package com.plateno.booking.mapper;

import com.plateno.booking.model.DicCode;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:20
 */
public interface DicCodeMapper {

	public int addEntity(DicCode model);

	public int deleteEntity(DicCode model);

	public int updateEntity(DicCode model);

	public DicCode findEntity(DicCode model);

	public List<DicCode> findEntityList(DicCode model);

}
