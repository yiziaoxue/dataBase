package com.plateno.booking.service.impl;

import com.plateno.booking.model.GsOrderInnDay;
import com.plateno.booking.mapper.GsOrderInnDayMapper;
import com.plateno.booking.service.GsOrderInnDayService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
@Service("gsOrderInnDayService")
public class GsOrderInnDayServiceImpl implements GsOrderInnDayService {

	private Logger log = Logger.getLogger(GsOrderInnDayServiceImpl.class);

	@Autowired
	private GsOrderInnDayMapper gsOrderInnDayMapper;

	@Override
	public int addEntity(GsOrderInnDay model) throws Exception {
		try {
			log.info("addEntity");
			gsOrderInnDayMapper.addEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("addEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int deleteEntity(GsOrderInnDay model) throws Exception {
		try {
			log.info("deleteEntity");
			return gsOrderInnDayMapper.deleteEntity(model);
		} catch(Exception e) {
			log.info("deleteEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int updateEntity(GsOrderInnDay model) throws Exception {
		try {
			log.info("updateEntity");
			gsOrderInnDayMapper.updateEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("updateEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public GsOrderInnDay findEntity(GsOrderInnDay model) throws Exception {
		try {
			log.info("findEntity");
			return gsOrderInnDayMapper.findEntity(model);
		} catch(Exception e) {
			log.info("findEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public List<GsOrderInnDay> findEntityList(GsOrderInnDay model) throws Exception {
		try {
			log.info("findEntityList");
			return gsOrderInnDayMapper.findEntityList(model);
		} catch(Exception e) {
			log.info("findEntityList异常");
			e.printStackTrace();
			throw e;
		}
	}

}
