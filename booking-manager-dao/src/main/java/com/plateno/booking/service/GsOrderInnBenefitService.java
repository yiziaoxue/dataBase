package com.plateno.booking.service;

import com.plateno.booking.model.GsOrderInnBenefit;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
public interface GsOrderInnBenefitService {

	//增加实体
	public int addEntity(GsOrderInnBenefit model) throws Exception;

	//删除实体
	public int deleteEntity(GsOrderInnBenefit model) throws Exception;

	//修改实体
	public int updateEntity(GsOrderInnBenefit model) throws Exception;

	//查询实体
	public GsOrderInnBenefit findEntity(GsOrderInnBenefit model) throws Exception;

	//查询实体List
	public List<GsOrderInnBenefit> findEntityList(GsOrderInnBenefit model) throws Exception;

}
