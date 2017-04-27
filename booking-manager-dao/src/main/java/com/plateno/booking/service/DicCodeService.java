package com.plateno.booking.service;

import com.plateno.booking.model.DicCode;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:21
 */
public interface DicCodeService {

	//增加实体
	public int addEntity(DicCode model) throws Exception;

	//删除实体
	public int deleteEntity(DicCode model) throws Exception;

	//修改实体
	public int updateEntity(DicCode model) throws Exception;

	//查询实体
	public DicCode findEntity(DicCode model) throws Exception;

	//查询实体List
	public List<DicCode> findEntityList(DicCode model) throws Exception;

}
