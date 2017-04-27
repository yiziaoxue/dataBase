package com.plateno.booking.service.impl;

import com.plateno.booking.model.GsOrderInnActivity;
import com.plateno.booking.mapper.GsOrderInnActivityMapper;
import com.plateno.booking.service.GsOrderInnActivityService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
@Service("gsOrderInnActivityService")
public class GsOrderInnActivityServiceImpl implements GsOrderInnActivityService {

	private Logger log = Logger.getLogger(GsOrderInnActivityServiceImpl.class);

	@Autowired
	private GsOrderInnActivityMapper gsOrderInnActivityMapper;

	@Override
	public int addEntity(GsOrderInnActivity model) throws Exception {
		try {
			log.info("addEntity");
			gsOrderInnActivityMapper.addEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("addEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int deleteEntity(GsOrderInnActivity model) throws Exception {
		try {
			log.info("deleteEntity");
			return gsOrderInnActivityMapper.deleteEntity(model);
		} catch(Exception e) {
			log.info("deleteEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int updateEntity(GsOrderInnActivity model) throws Exception {
		try {
			log.info("updateEntity");
			gsOrderInnActivityMapper.updateEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("updateEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public GsOrderInnActivity findEntity(GsOrderInnActivity model) throws Exception {
		try {
			log.info("findEntity");
			return gsOrderInnActivityMapper.findEntity(model);
		} catch(Exception e) {
			log.info("findEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public List<GsOrderInnActivity> findEntityList(GsOrderInnActivity model) throws Exception {
		try {
			log.info("findEntityList");
			return gsOrderInnActivityMapper.findEntityList(model);
		} catch(Exception e) {
			log.info("findEntityList异常");
			e.printStackTrace();
			throw e;
		}
	}

}
