package com.plateno.booking.service;

import com.plateno.booking.model.GsTransFail;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:21
 */
public interface GsTransFailService {

	//增加实体
	public int addEntity(GsTransFail model) throws Exception;

	//删除实体
	public int deleteEntity(GsTransFail model) throws Exception;

	//修改实体
	public int updateEntity(GsTransFail model) throws Exception;

	//查询实体
	public GsTransFail findEntity(GsTransFail model) throws Exception;

	//查询实体List
	public List<GsTransFail> findEntityList(GsTransFail model) throws Exception;

}
