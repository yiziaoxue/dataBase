package com.plateno.booking.service.impl;

import com.plateno.booking.model.GsOrderInnGuest;
import com.plateno.booking.mapper.GsOrderInnGuestMapper;
import com.plateno.booking.service.GsOrderInnGuestService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
@Service("gsOrderInnGuestService")
public class GsOrderInnGuestServiceImpl implements GsOrderInnGuestService {

	private Logger log = Logger.getLogger(GsOrderInnGuestServiceImpl.class);

	@Autowired
	private GsOrderInnGuestMapper gsOrderInnGuestMapper;

	@Override
	public int addEntity(GsOrderInnGuest model) throws Exception {
		try {
			log.info("addEntity");
			gsOrderInnGuestMapper.addEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("addEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int deleteEntity(GsOrderInnGuest model) throws Exception {
		try {
			log.info("deleteEntity");
			return gsOrderInnGuestMapper.deleteEntity(model);
		} catch(Exception e) {
			log.info("deleteEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int updateEntity(GsOrderInnGuest model) throws Exception {
		try {
			log.info("updateEntity");
			gsOrderInnGuestMapper.updateEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("updateEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public GsOrderInnGuest findEntity(GsOrderInnGuest model) throws Exception {
		try {
			log.info("findEntity");
			return gsOrderInnGuestMapper.findEntity(model);
		} catch(Exception e) {
			log.info("findEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public List<GsOrderInnGuest> findEntityList(GsOrderInnGuest model) throws Exception {
		try {
			log.info("findEntityList");
			return gsOrderInnGuestMapper.findEntityList(model);
		} catch(Exception e) {
			log.info("findEntityList异常");
			e.printStackTrace();
			throw e;
		}
	}

}
