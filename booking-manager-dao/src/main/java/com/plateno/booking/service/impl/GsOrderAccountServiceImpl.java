package com.plateno.booking.service.impl;

import com.plateno.booking.model.GsOrderAccount;
import com.plateno.booking.mapper.GsOrderAccountMapper;
import com.plateno.booking.service.GsOrderAccountService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
@Service("gsOrderAccountService")
public class GsOrderAccountServiceImpl implements GsOrderAccountService {

	private Logger log = Logger.getLogger(GsOrderAccountServiceImpl.class);

	@Autowired
	private GsOrderAccountMapper gsOrderAccountMapper;

	@Override
	public int addEntity(GsOrderAccount model) throws Exception {
		try {
			log.info("addEntity");
			gsOrderAccountMapper.addEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("addEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int deleteEntity(GsOrderAccount model) throws Exception {
		try {
			log.info("deleteEntity");
			return gsOrderAccountMapper.deleteEntity(model);
		} catch(Exception e) {
			log.info("deleteEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int updateEntity(GsOrderAccount model) throws Exception {
		try {
			log.info("updateEntity");
			gsOrderAccountMapper.updateEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("updateEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public GsOrderAccount findEntity(GsOrderAccount model) throws Exception {
		try {
			log.info("findEntity");
			return gsOrderAccountMapper.findEntity(model);
		} catch(Exception e) {
			log.info("findEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public List<GsOrderAccount> findEntityList(GsOrderAccount model) throws Exception {
		try {
			log.info("findEntityList");
			return gsOrderAccountMapper.findEntityList(model);
		} catch(Exception e) {
			log.info("findEntityList异常");
			e.printStackTrace();
			throw e;
		}
	}

}
