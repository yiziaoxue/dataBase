package com.plateno.booking.service.impl;

import com.plateno.booking.model.GsOrderUpdate;
import com.plateno.booking.mapper.GsOrderUpdateMapper;
import com.plateno.booking.service.GsOrderUpdateService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
@Service("gsOrderUpdateService")
public class GsOrderUpdateServiceImpl implements GsOrderUpdateService {

	private Logger log = Logger.getLogger(GsOrderUpdateServiceImpl.class);

	@Autowired
	private GsOrderUpdateMapper gsOrderUpdateMapper;

	@Override
	public int addEntity(GsOrderUpdate model) throws Exception {
		try {
			log.info("addEntity");
			gsOrderUpdateMapper.addEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("addEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int deleteEntity(GsOrderUpdate model) throws Exception {
		try {
			log.info("deleteEntity");
			return gsOrderUpdateMapper.deleteEntity(model);
		} catch(Exception e) {
			log.info("deleteEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int updateEntity(GsOrderUpdate model) throws Exception {
		try {
			log.info("updateEntity");
			gsOrderUpdateMapper.updateEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("updateEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public GsOrderUpdate findEntity(GsOrderUpdate model) throws Exception {
		try {
			log.info("findEntity");
			return gsOrderUpdateMapper.findEntity(model);
		} catch(Exception e) {
			log.info("findEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public List<GsOrderUpdate> findEntityList(GsOrderUpdate model) throws Exception {
		try {
			log.info("findEntityList");
			return gsOrderUpdateMapper.findEntityList(model);
		} catch(Exception e) {
			log.info("findEntityList异常");
			e.printStackTrace();
			throw e;
		}
	}

}
