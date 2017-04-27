package com.plateno.booking.service.impl;

import com.plateno.booking.model.GsOrderBackpayLog;
import com.plateno.booking.mapper.GsOrderBackpayLogMapper;
import com.plateno.booking.service.GsOrderBackpayLogService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
@Service("gsOrderBackpayLogService")
public class GsOrderBackpayLogServiceImpl implements GsOrderBackpayLogService {

	private Logger log = Logger.getLogger(GsOrderBackpayLogServiceImpl.class);

	@Autowired
	private GsOrderBackpayLogMapper gsOrderBackpayLogMapper;

	@Override
	public int addEntity(GsOrderBackpayLog model) throws Exception {
		try {
			log.info("addEntity");
			gsOrderBackpayLogMapper.addEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("addEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int deleteEntity(GsOrderBackpayLog model) throws Exception {
		try {
			log.info("deleteEntity");
			return gsOrderBackpayLogMapper.deleteEntity(model);
		} catch(Exception e) {
			log.info("deleteEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int updateEntity(GsOrderBackpayLog model) throws Exception {
		try {
			log.info("updateEntity");
			gsOrderBackpayLogMapper.updateEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("updateEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public GsOrderBackpayLog findEntity(GsOrderBackpayLog model) throws Exception {
		try {
			log.info("findEntity");
			return gsOrderBackpayLogMapper.findEntity(model);
		} catch(Exception e) {
			log.info("findEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public List<GsOrderBackpayLog> findEntityList(GsOrderBackpayLog model) throws Exception {
		try {
			log.info("findEntityList");
			return gsOrderBackpayLogMapper.findEntityList(model);
		} catch(Exception e) {
			log.info("findEntityList异常");
			e.printStackTrace();
			throw e;
		}
	}

}
