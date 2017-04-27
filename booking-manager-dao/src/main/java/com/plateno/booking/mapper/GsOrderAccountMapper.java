package com.plateno.booking.mapper;

import com.plateno.booking.model.GsOrderAccount;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
public interface GsOrderAccountMapper {

	public int addEntity(GsOrderAccount model);

	public int deleteEntity(GsOrderAccount model);

	public int updateEntity(GsOrderAccount model);

	public GsOrderAccount findEntity(GsOrderAccount model);

	public List<GsOrderAccount> findEntityList(GsOrderAccount model);

}
