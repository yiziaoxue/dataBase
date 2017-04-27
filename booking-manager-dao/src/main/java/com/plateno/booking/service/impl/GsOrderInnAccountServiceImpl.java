package com.plateno.booking.service.impl;

import com.plateno.booking.model.GsOrderInnAccount;
import com.plateno.booking.mapper.GsOrderInnAccountMapper;
import com.plateno.booking.service.GsOrderInnAccountService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
@Service("gsOrderInnAccountService")
public class GsOrderInnAccountServiceImpl implements GsOrderInnAccountService {

	private Logger log = Logger.getLogger(GsOrderInnAccountServiceImpl.class);

	@Autowired
	private GsOrderInnAccountMapper gsOrderInnAccountMapper;

	@Override
	public int addEntity(GsOrderInnAccount model) throws Exception {
		try {
			log.info("addEntity");
			gsOrderInnAccountMapper.addEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("addEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int deleteEntity(GsOrderInnAccount model) throws Exception {
		try {
			log.info("deleteEntity");
			return gsOrderInnAccountMapper.deleteEntity(model);
		} catch(Exception e) {
			log.info("deleteEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int updateEntity(GsOrderInnAccount model) throws Exception {
		try {
			log.info("updateEntity");
			gsOrderInnAccountMapper.updateEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("updateEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public GsOrderInnAccount findEntity(GsOrderInnAccount model) throws Exception {
		try {
			log.info("findEntity");
			return gsOrderInnAccountMapper.findEntity(model);
		} catch(Exception e) {
			log.info("findEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public List<GsOrderInnAccount> findEntityList(GsOrderInnAccount model) throws Exception {
		try {
			log.info("findEntityList");
			return gsOrderInnAccountMapper.findEntityList(model);
		} catch(Exception e) {
			log.info("findEntityList异常");
			e.printStackTrace();
			throw e;
		}
	}

}
