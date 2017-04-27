package com.plateno.booking.mapper;

import com.plateno.booking.model.GsOrderInnAccount;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
public interface GsOrderInnAccountMapper {

	public int addEntity(GsOrderInnAccount model);

	public int deleteEntity(GsOrderInnAccount model);

	public int updateEntity(GsOrderInnAccount model);

	public GsOrderInnAccount findEntity(GsOrderInnAccount model);

	public List<GsOrderInnAccount> findEntityList(GsOrderInnAccount model);

}
