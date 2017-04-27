package com.plateno.booking.service.impl;

import com.plateno.booking.model.InnerCity;
import com.plateno.booking.mapper.InnerCityMapper;
import com.plateno.booking.service.InnerCityService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:21
 */
@Service("innerCityService")
public class InnerCityServiceImpl implements InnerCityService {

	private Logger log = Logger.getLogger(InnerCityServiceImpl.class);

	@Autowired
	private InnerCityMapper innerCityMapper;

	@Override
	public int addEntity(InnerCity model) throws Exception {
		try {
			log.info("addEntity");
			innerCityMapper.addEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("addEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int deleteEntity(InnerCity model) throws Exception {
		try {
			log.info("deleteEntity");
			return innerCityMapper.deleteEntity(model);
		} catch(Exception e) {
			log.info("deleteEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int updateEntity(InnerCity model) throws Exception {
		try {
			log.info("updateEntity");
			innerCityMapper.updateEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("updateEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public InnerCity findEntity(InnerCity model) throws Exception {
		try {
			log.info("findEntity");
			return innerCityMapper.findEntity(model);
		} catch(Exception e) {
			log.info("findEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public List<InnerCity> findEntityList(InnerCity model) throws Exception {
		try {
			log.info("findEntityList");
			return innerCityMapper.findEntityList(model);
		} catch(Exception e) {
			log.info("findEntityList异常");
			e.printStackTrace();
			throw e;
		}
	}

}
