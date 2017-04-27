package com.plateno.booking.service.impl;

import com.plateno.booking.model.GsOrderInnExternal;
import com.plateno.booking.mapper.GsOrderInnExternalMapper;
import com.plateno.booking.service.GsOrderInnExternalService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
@Service("gsOrderInnExternalService")
public class GsOrderInnExternalServiceImpl implements GsOrderInnExternalService {

	private Logger log = Logger.getLogger(GsOrderInnExternalServiceImpl.class);

	@Autowired
	private GsOrderInnExternalMapper gsOrderInnExternalMapper;

	@Override
	public int addEntity(GsOrderInnExternal model) throws Exception {
		try {
			log.info("addEntity");
			gsOrderInnExternalMapper.addEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("addEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int deleteEntity(GsOrderInnExternal model) throws Exception {
		try {
			log.info("deleteEntity");
			return gsOrderInnExternalMapper.deleteEntity(model);
		} catch(Exception e) {
			log.info("deleteEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int updateEntity(GsOrderInnExternal model) throws Exception {
		try {
			log.info("updateEntity");
			gsOrderInnExternalMapper.updateEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("updateEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public GsOrderInnExternal findEntity(GsOrderInnExternal model) throws Exception {
		try {
			log.info("findEntity");
			return gsOrderInnExternalMapper.findEntity(model);
		} catch(Exception e) {
			log.info("findEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public List<GsOrderInnExternal> findEntityList(GsOrderInnExternal model) throws Exception {
		try {
			log.info("findEntityList");
			return gsOrderInnExternalMapper.findEntityList(model);
		} catch(Exception e) {
			log.info("findEntityList异常");
			e.printStackTrace();
			throw e;
		}
	}

}
