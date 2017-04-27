package com.plateno.booking.service.impl;

import com.plateno.booking.model.DicCode;
import com.plateno.booking.mapper.DicCodeMapper;
import com.plateno.booking.service.DicCodeService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:21
 */
@Service("dicCodeService")
public class DicCodeServiceImpl implements DicCodeService {

	private Logger log = Logger.getLogger(DicCodeServiceImpl.class);

	@Autowired
	private DicCodeMapper dicCodeMapper;

	@Override
	public int addEntity(DicCode model) throws Exception {
		try {
			log.info("addEntity");
			dicCodeMapper.addEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("addEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int deleteEntity(DicCode model) throws Exception {
		try {
			log.info("deleteEntity");
			return dicCodeMapper.deleteEntity(model);
		} catch(Exception e) {
			log.info("deleteEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int updateEntity(DicCode model) throws Exception {
		try {
			log.info("updateEntity");
			dicCodeMapper.updateEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("updateEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public DicCode findEntity(DicCode model) throws Exception {
		try {
			log.info("findEntity");
			return dicCodeMapper.findEntity(model);
		} catch(Exception e) {
			log.info("findEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public List<DicCode> findEntityList(DicCode model) throws Exception {
		try {
			log.info("findEntityList");
			return dicCodeMapper.findEntityList(model);
		} catch(Exception e) {
			log.info("findEntityList异常");
			e.printStackTrace();
			throw e;
		}
	}

}
