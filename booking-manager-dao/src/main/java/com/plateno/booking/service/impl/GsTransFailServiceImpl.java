package com.plateno.booking.service.impl;

import com.plateno.booking.model.GsTransFail;
import com.plateno.booking.mapper.GsTransFailMapper;
import com.plateno.booking.service.GsTransFailService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:21
 */
@Service("gsTransFailService")
public class GsTransFailServiceImpl implements GsTransFailService {

	private Logger log = Logger.getLogger(GsTransFailServiceImpl.class);

	@Autowired
	private GsTransFailMapper gsTransFailMapper;

	@Override
	public int addEntity(GsTransFail model) throws Exception {
		try {
			log.info("addEntity");
			gsTransFailMapper.addEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("addEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int deleteEntity(GsTransFail model) throws Exception {
		try {
			log.info("deleteEntity");
			return gsTransFailMapper.deleteEntity(model);
		} catch(Exception e) {
			log.info("deleteEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int updateEntity(GsTransFail model) throws Exception {
		try {
			log.info("updateEntity");
			gsTransFailMapper.updateEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("updateEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public GsTransFail findEntity(GsTransFail model) throws Exception {
		try {
			log.info("findEntity");
			return gsTransFailMapper.findEntity(model);
		} catch(Exception e) {
			log.info("findEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public List<GsTransFail> findEntityList(GsTransFail model) throws Exception {
		try {
			log.info("findEntityList");
			return gsTransFailMapper.findEntityList(model);
		} catch(Exception e) {
			log.info("findEntityList异常");
			e.printStackTrace();
			throw e;
		}
	}

}
