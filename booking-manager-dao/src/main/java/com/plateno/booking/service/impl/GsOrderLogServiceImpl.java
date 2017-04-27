package com.plateno.booking.service.impl;

import com.plateno.booking.model.GsOrderLog;
import com.plateno.booking.mapper.GsOrderLogMapper;
import com.plateno.booking.service.GsOrderLogService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
@Service("gsOrderLogService")
public class GsOrderLogServiceImpl implements GsOrderLogService {

	private Logger log = Logger.getLogger(GsOrderLogServiceImpl.class);

	@Autowired
	private GsOrderLogMapper gsOrderLogMapper;

	@Override
	public int addEntity(GsOrderLog model) throws Exception {
		try {
			log.info("addEntity");
			gsOrderLogMapper.addEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("addEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int deleteEntity(GsOrderLog model) throws Exception {
		try {
			log.info("deleteEntity");
			return gsOrderLogMapper.deleteEntity(model);
		} catch(Exception e) {
			log.info("deleteEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int updateEntity(GsOrderLog model) throws Exception {
		try {
			log.info("updateEntity");
			gsOrderLogMapper.updateEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("updateEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public GsOrderLog findEntity(GsOrderLog model) throws Exception {
		try {
			log.info("findEntity");
			return gsOrderLogMapper.findEntity(model);
		} catch(Exception e) {
			log.info("findEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public List<GsOrderLog> findEntityList(GsOrderLog model) throws Exception {
		try {
			log.info("findEntityList");
			return gsOrderLogMapper.findEntityList(model);
		} catch(Exception e) {
			log.info("findEntityList异常");
			e.printStackTrace();
			throw e;
		}
	}

}
