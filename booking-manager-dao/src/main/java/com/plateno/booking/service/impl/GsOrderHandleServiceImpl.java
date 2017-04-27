package com.plateno.booking.service.impl;

import com.plateno.booking.model.GsOrderHandle;
import com.plateno.booking.mapper.GsOrderHandleMapper;
import com.plateno.booking.service.GsOrderHandleService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
@Service("gsOrderHandleService")
public class GsOrderHandleServiceImpl implements GsOrderHandleService {

	private Logger log = Logger.getLogger(GsOrderHandleServiceImpl.class);

	@Autowired
	private GsOrderHandleMapper gsOrderHandleMapper;

	@Override
	public int addEntity(GsOrderHandle model) throws Exception {
		try {
			log.info("addEntity");
			gsOrderHandleMapper.addEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("addEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int deleteEntity(GsOrderHandle model) throws Exception {
		try {
			log.info("deleteEntity");
			return gsOrderHandleMapper.deleteEntity(model);
		} catch(Exception e) {
			log.info("deleteEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int updateEntity(GsOrderHandle model) throws Exception {
		try {
			log.info("updateEntity");
			gsOrderHandleMapper.updateEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("updateEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public GsOrderHandle findEntity(GsOrderHandle model) throws Exception {
		try {
			log.info("findEntity");
			return gsOrderHandleMapper.findEntity(model);
		} catch(Exception e) {
			log.info("findEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public List<GsOrderHandle> findEntityList(GsOrderHandle model) throws Exception {
		try {
			log.info("findEntityList");
			return gsOrderHandleMapper.findEntityList(model);
		} catch(Exception e) {
			log.info("findEntityList异常");
			e.printStackTrace();
			throw e;
		}
	}

}
