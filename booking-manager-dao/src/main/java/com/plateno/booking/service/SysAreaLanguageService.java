package com.plateno.booking.service;

import com.plateno.booking.model.SysAreaLanguage;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:21
 */
public interface SysAreaLanguageService {

	//增加实体
	public int addEntity(SysAreaLanguage model) throws Exception;

	//删除实体
	public int deleteEntity(SysAreaLanguage model) throws Exception;

	//修改实体
	public int updateEntity(SysAreaLanguage model) throws Exception;

	//查询实体
	public SysAreaLanguage findEntity(SysAreaLanguage model) throws Exception;

	//查询实体List
	public List<SysAreaLanguage> findEntityList(SysAreaLanguage model) throws Exception;

}
