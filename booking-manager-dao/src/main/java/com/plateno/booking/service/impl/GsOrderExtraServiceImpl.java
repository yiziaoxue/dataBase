package com.plateno.booking.service.impl;

import com.plateno.booking.model.GsOrderExtra;
import com.plateno.booking.mapper.GsOrderExtraMapper;
import com.plateno.booking.service.GsOrderExtraService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
@Service("gsOrderExtraService")
public class GsOrderExtraServiceImpl implements GsOrderExtraService {

	private Logger log = Logger.getLogger(GsOrderExtraServiceImpl.class);

	@Autowired
	private GsOrderExtraMapper gsOrderExtraMapper;

	@Override
	public int addEntity(GsOrderExtra model) throws Exception {
		try {
			log.info("addEntity");
			gsOrderExtraMapper.addEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("addEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int deleteEntity(GsOrderExtra model) throws Exception {
		try {
			log.info("deleteEntity");
			return gsOrderExtraMapper.deleteEntity(model);
		} catch(Exception e) {
			log.info("deleteEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int updateEntity(GsOrderExtra model) throws Exception {
		try {
			log.info("updateEntity");
			gsOrderExtraMapper.updateEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("updateEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public GsOrderExtra findEntity(GsOrderExtra model) throws Exception {
		try {
			log.info("findEntity");
			return gsOrderExtraMapper.findEntity(model);
		} catch(Exception e) {
			log.info("findEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public List<GsOrderExtra> findEntityList(GsOrderExtra model) throws Exception {
		try {
			log.info("findEntityList");
			return gsOrderExtraMapper.findEntityList(model);
		} catch(Exception e) {
			log.info("findEntityList异常");
			e.printStackTrace();
			throw e;
		}
	}

}
