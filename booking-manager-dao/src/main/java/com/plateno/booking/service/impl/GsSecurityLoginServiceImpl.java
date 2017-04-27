package com.plateno.booking.service.impl;

import com.plateno.booking.model.GsSecurityLogin;
import com.plateno.booking.mapper.GsSecurityLoginMapper;
import com.plateno.booking.service.GsSecurityLoginService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:21
 */
@Service("gsSecurityLoginService")
public class GsSecurityLoginServiceImpl implements GsSecurityLoginService {

	private Logger log = Logger.getLogger(GsSecurityLoginServiceImpl.class);

	@Autowired
	private GsSecurityLoginMapper gsSecurityLoginMapper;

	@Override
	public int addEntity(GsSecurityLogin model) throws Exception {
		try {
			log.info("addEntity");
			gsSecurityLoginMapper.addEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("addEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int deleteEntity(GsSecurityLogin model) throws Exception {
		try {
			log.info("deleteEntity");
			return gsSecurityLoginMapper.deleteEntity(model);
		} catch(Exception e) {
			log.info("deleteEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int updateEntity(GsSecurityLogin model) throws Exception {
		try {
			log.info("updateEntity");
			gsSecurityLoginMapper.updateEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("updateEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public GsSecurityLogin findEntity(GsSecurityLogin model) throws Exception {
		try {
			log.info("findEntity");
			return gsSecurityLoginMapper.findEntity(model);
		} catch(Exception e) {
			log.info("findEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public List<GsSecurityLogin> findEntityList(GsSecurityLogin model) throws Exception {
		try {
			log.info("findEntityList");
			return gsSecurityLoginMapper.findEntityList(model);
		} catch(Exception e) {
			log.info("findEntityList异常");
			e.printStackTrace();
			throw e;
		}
	}

}
