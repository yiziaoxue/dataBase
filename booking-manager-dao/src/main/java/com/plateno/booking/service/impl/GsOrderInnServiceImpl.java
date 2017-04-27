package com.plateno.booking.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plateno.booking.mapper.GsOrderInnMapper;
import com.plateno.booking.model.GsOrderInn;
import com.plateno.booking.param.OrderInnParam;
import com.plateno.booking.service.GsOrderInnService;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
@Service("gsOrderInnService")
public class GsOrderInnServiceImpl implements GsOrderInnService {

	private Logger log = Logger.getLogger(GsOrderInnServiceImpl.class);

	@Autowired
	private GsOrderInnMapper gsOrderInnMapper;

	@Override
	public int addEntity(GsOrderInn model) throws Exception {
		try {
			log.info("addEntity");
			gsOrderInnMapper.addEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("addEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int deleteEntity(GsOrderInn model) throws Exception {
		try {
			log.info("deleteEntity");
			return gsOrderInnMapper.deleteEntity(model);
		} catch(Exception e) {
			log.info("deleteEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int updateEntity(GsOrderInn model) throws Exception {
		try {
			log.info("updateEntity");
			gsOrderInnMapper.updateEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("updateEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public GsOrderInn findEntity(GsOrderInn model) throws Exception {
		try {
			log.info("findEntity");
			return gsOrderInnMapper.findEntity(model);
		} catch(Exception e) {
			log.info("findEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public List<GsOrderInn> findEntityList(OrderInnParam model) throws Exception {
		try {
			log.info("findEntityList");
			return gsOrderInnMapper.findEntityList(model);
		} catch(Exception e) {
			log.info("findEntityList异常");
			e.printStackTrace();
			throw e;
		}
	}
	
	@Override
	public GsOrderInn getBkMebIdByOrderCode(GsOrderInn model) throws Exception {
		try {
			log.info("getBkMebIdByOrderCode");
			return gsOrderInnMapper.getBkMebIdByOrderCode(model);
		} catch(Exception e) {
			log.info("getBkMebIdByOrderCode异常");
			e.printStackTrace();
			throw e;
		}
	}

}
