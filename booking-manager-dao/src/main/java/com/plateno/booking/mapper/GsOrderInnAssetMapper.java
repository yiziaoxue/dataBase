package com.plateno.booking.mapper;

import com.plateno.booking.model.GsOrderInnAsset;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
public interface GsOrderInnAssetMapper {

	public int addEntity(GsOrderInnAsset model);

	public int deleteEntity(GsOrderInnAsset model);

	public int updateEntity(GsOrderInnAsset model);

	public GsOrderInnAsset findEntity(GsOrderInnAsset model);

	public List<GsOrderInnAsset> findEntityList(GsOrderInnAsset model);

}
