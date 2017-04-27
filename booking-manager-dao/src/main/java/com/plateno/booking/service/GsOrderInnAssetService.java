package com.plateno.booking.service;

import com.plateno.booking.model.GsOrderInnAsset;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
public interface GsOrderInnAssetService {

	//增加实体
	public int addEntity(GsOrderInnAsset model) throws Exception;

	//删除实体
	public int deleteEntity(GsOrderInnAsset model) throws Exception;

	//修改实体
	public int updateEntity(GsOrderInnAsset model) throws Exception;

	//查询实体
	public GsOrderInnAsset findEntity(GsOrderInnAsset model) throws Exception;

	//查询实体List
	public List<GsOrderInnAsset> findEntityList(GsOrderInnAsset model) throws Exception;

}
