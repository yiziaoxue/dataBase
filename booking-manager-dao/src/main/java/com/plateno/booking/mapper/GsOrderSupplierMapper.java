package com.plateno.booking.mapper;

import com.plateno.booking.model.GsOrderSupplier;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:21
 */
public interface GsOrderSupplierMapper {

	public int addEntity(GsOrderSupplier model);

	public int deleteEntity(GsOrderSupplier model);

	public int updateEntity(GsOrderSupplier model);

	public GsOrderSupplier findEntity(GsOrderSupplier model);

	public List<GsOrderSupplier> findEntityList(GsOrderSupplier model);

}
