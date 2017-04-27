package com.plateno.booking.mapper;

import com.plateno.booking.model.GsOrderInnBenefit;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
public interface GsOrderInnBenefitMapper {

	public int addEntity(GsOrderInnBenefit model);

	public int deleteEntity(GsOrderInnBenefit model);

	public int updateEntity(GsOrderInnBenefit model);

	public GsOrderInnBenefit findEntity(GsOrderInnBenefit model);

	public List<GsOrderInnBenefit> findEntityList(GsOrderInnBenefit model);

}
