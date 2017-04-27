package com.plateno.booking.service.impl;

import com.plateno.booking.model.GsTransLog;
import com.plateno.booking.mapper.GsTransLogMapper;
import com.plateno.booking.service.GsTransLogService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
@Service("gsTransLogService")
public class GsTransLogServiceImpl implements GsTransLogService {

	private Logger log = Logger.getLogger(GsTransLogServiceImpl.class);

	@Autowired
	private GsTransLogMapper gsTransLogMapper;

	@Override
	public int addEntity(GsTransLog model) throws Exception {
		try {
			log.info("addEntity");
			gsTransLogMapper.addEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("addEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int deleteEntity(GsTransLog model) throws Exception {
		try {
			log.info("deleteEntity");
			return gsTransLogMapper.deleteEntity(model);
		} catch(Exception e) {
			log.info("deleteEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int updateEntity(GsTransLog model) throws Exception {
		try {
			log.info("updateEntity");
			gsTransLogMapper.updateEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("updateEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public GsTransLog findEntity(GsTransLog model) throws Exception {
		try {
			log.info("findEntity");
			return gsTransLogMapper.findEntity(model);
		} catch(Exception e) {
			log.info("findEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public List<GsTransLog> findEntityList(GsTransLog model) throws Exception {
		try {
			log.info("findEntityList");
			return gsTransLogMapper.findEntityList(model);
		} catch(Exception e) {
			log.info("findEntityList异常");
			e.printStackTrace();
			throw e;
		}
	}

}
