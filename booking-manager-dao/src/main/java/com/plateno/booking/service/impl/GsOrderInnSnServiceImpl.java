package com.plateno.booking.service.impl;

import com.plateno.booking.model.GsOrderInnSn;
import com.plateno.booking.mapper.GsOrderInnSnMapper;
import com.plateno.booking.service.GsOrderInnSnService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
@Service("gsOrderInnSnService")
public class GsOrderInnSnServiceImpl implements GsOrderInnSnService {

	private Logger log = Logger.getLogger(GsOrderInnSnServiceImpl.class);

	@Autowired
	private GsOrderInnSnMapper gsOrderInnSnMapper;

	@Override
	public int addEntity(GsOrderInnSn model) throws Exception {
		try {
			log.info("addEntity");
			gsOrderInnSnMapper.addEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("addEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int deleteEntity(GsOrderInnSn model) throws Exception {
		try {
			log.info("deleteEntity");
			return gsOrderInnSnMapper.deleteEntity(model);
		} catch(Exception e) {
			log.info("deleteEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int updateEntity(GsOrderInnSn model) throws Exception {
		try {
			log.info("updateEntity");
			gsOrderInnSnMapper.updateEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("updateEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public GsOrderInnSn findEntity(GsOrderInnSn model) throws Exception {
		try {
			log.info("findEntity");
			return gsOrderInnSnMapper.findEntity(model);
		} catch(Exception e) {
			log.info("findEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public List<GsOrderInnSn> findEntityList(GsOrderInnSn model) throws Exception {
		try {
			log.info("findEntityList");
			return gsOrderInnSnMapper.findEntityList(model);
		} catch(Exception e) {
			log.info("findEntityList异常");
			e.printStackTrace();
			throw e;
		}
	}

}
