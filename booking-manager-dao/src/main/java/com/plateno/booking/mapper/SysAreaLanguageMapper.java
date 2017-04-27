package com.plateno.booking.mapper;

import com.plateno.booking.model.SysAreaLanguage;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:21
 */
public interface SysAreaLanguageMapper {

	public int addEntity(SysAreaLanguage model);

	public int deleteEntity(SysAreaLanguage model);

	public int updateEntity(SysAreaLanguage model);

	public SysAreaLanguage findEntity(SysAreaLanguage model);

	public List<SysAreaLanguage> findEntityList(SysAreaLanguage model);

}
