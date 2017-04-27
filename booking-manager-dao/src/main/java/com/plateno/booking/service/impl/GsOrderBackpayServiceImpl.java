package com.plateno.booking.service.impl;

import com.plateno.booking.model.GsOrderBackpay;
import com.plateno.booking.mapper.GsOrderBackpayMapper;
import com.plateno.booking.service.GsOrderBackpayService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
@Service("gsOrderBackpayService")
public class GsOrderBackpayServiceImpl implements GsOrderBackpayService {

	private Logger log = Logger.getLogger(GsOrderBackpayServiceImpl.class);

	@Autowired
	private GsOrderBackpayMapper gsOrderBackpayMapper;

	@Override
	public int addEntity(GsOrderBackpay model) throws Exception {
		try {
			log.info("addEntity");
			gsOrderBackpayMapper.addEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("addEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int deleteEntity(GsOrderBackpay model) throws Exception {
		try {
			log.info("deleteEntity");
			return gsOrderBackpayMapper.deleteEntity(model);
		} catch(Exception e) {
			log.info("deleteEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int updateEntity(GsOrderBackpay model) throws Exception {
		try {
			log.info("updateEntity");
			gsOrderBackpayMapper.updateEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("updateEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public GsOrderBackpay findEntity(GsOrderBackpay model) throws Exception {
		try {
			log.info("findEntity");
			return gsOrderBackpayMapper.findEntity(model);
		} catch(Exception e) {
			log.info("findEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public List<GsOrderBackpay> findEntityList(GsOrderBackpay model) throws Exception {
		try {
			log.info("findEntityList");
			return gsOrderBackpayMapper.findEntityList(model);
		} catch(Exception e) {
			log.info("findEntityList异常");
			e.printStackTrace();
			throw e;
		}
	}

}
