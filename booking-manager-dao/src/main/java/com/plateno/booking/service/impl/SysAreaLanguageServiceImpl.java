package com.plateno.booking.service.impl;

import com.plateno.booking.model.SysAreaLanguage;
import com.plateno.booking.mapper.SysAreaLanguageMapper;
import com.plateno.booking.service.SysAreaLanguageService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:21
 */
@Service("sysAreaLanguageService")
public class SysAreaLanguageServiceImpl implements SysAreaLanguageService {

	private Logger log = Logger.getLogger(SysAreaLanguageServiceImpl.class);

	@Autowired
	private SysAreaLanguageMapper sysAreaLanguageMapper;

	@Override
	public int addEntity(SysAreaLanguage model) throws Exception {
		try {
			log.info("addEntity");
			sysAreaLanguageMapper.addEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("addEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int deleteEntity(SysAreaLanguage model) throws Exception {
		try {
			log.info("deleteEntity");
			return sysAreaLanguageMapper.deleteEntity(model);
		} catch(Exception e) {
			log.info("deleteEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int updateEntity(SysAreaLanguage model) throws Exception {
		try {
			log.info("updateEntity");
			sysAreaLanguageMapper.updateEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("updateEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public SysAreaLanguage findEntity(SysAreaLanguage model) throws Exception {
		try {
			log.info("findEntity");
			return sysAreaLanguageMapper.findEntity(model);
		} catch(Exception e) {
			log.info("findEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public List<SysAreaLanguage> findEntityList(SysAreaLanguage model) throws Exception {
		try {
			log.info("findEntityList");
			return sysAreaLanguageMapper.findEntityList(model);
		} catch(Exception e) {
			log.info("findEntityList异常");
			e.printStackTrace();
			throw e;
		}
	}

}
