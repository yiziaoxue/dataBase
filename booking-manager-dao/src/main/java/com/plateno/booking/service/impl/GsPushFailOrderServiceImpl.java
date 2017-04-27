package com.plateno.booking.service.impl;

import com.plateno.booking.model.GsPushFailOrder;
import com.plateno.booking.mapper.GsPushFailOrderMapper;
import com.plateno.booking.service.GsPushFailOrderService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:21
 */
@Service("gsPushFailOrderService")
public class GsPushFailOrderServiceImpl implements GsPushFailOrderService {

	private Logger log = Logger.getLogger(GsPushFailOrderServiceImpl.class);

	@Autowired
	private GsPushFailOrderMapper gsPushFailOrderMapper;

	@Override
	public int addEntity(GsPushFailOrder model) throws Exception {
		try {
			log.info("addEntity");
			gsPushFailOrderMapper.addEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("addEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int deleteEntity(GsPushFailOrder model) throws Exception {
		try {
			log.info("deleteEntity");
			return gsPushFailOrderMapper.deleteEntity(model);
		} catch(Exception e) {
			log.info("deleteEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int updateEntity(GsPushFailOrder model) throws Exception {
		try {
			log.info("updateEntity");
			gsPushFailOrderMapper.updateEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("updateEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public GsPushFailOrder findEntity(GsPushFailOrder model) throws Exception {
		try {
			log.info("findEntity");
			return gsPushFailOrderMapper.findEntity(model);
		} catch(Exception e) {
			log.info("findEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public List<GsPushFailOrder> findEntityList(GsPushFailOrder model) throws Exception {
		try {
			log.info("findEntityList");
			return gsPushFailOrderMapper.findEntityList(model);
		} catch(Exception e) {
			log.info("findEntityList异常");
			e.printStackTrace();
			throw e;
		}
	}

}
