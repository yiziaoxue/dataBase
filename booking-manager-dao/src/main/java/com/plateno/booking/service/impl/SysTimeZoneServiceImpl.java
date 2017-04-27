package com.plateno.booking.service.impl;

import com.plateno.booking.model.SysTimeZone;
import com.plateno.booking.mapper.SysTimeZoneMapper;
import com.plateno.booking.service.SysTimeZoneService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:21
 */
@Service("sysTimeZoneService")
public class SysTimeZoneServiceImpl implements SysTimeZoneService {

	private Logger log = Logger.getLogger(SysTimeZoneServiceImpl.class);

	@Autowired
	private SysTimeZoneMapper sysTimeZoneMapper;

	@Override
	public int addEntity(SysTimeZone model) throws Exception {
		try {
			log.info("addEntity");
			sysTimeZoneMapper.addEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("addEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int deleteEntity(SysTimeZone model) throws Exception {
		try {
			log.info("deleteEntity");
			return sysTimeZoneMapper.deleteEntity(model);
		} catch(Exception e) {
			log.info("deleteEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int updateEntity(SysTimeZone model) throws Exception {
		try {
			log.info("updateEntity");
			sysTimeZoneMapper.updateEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("updateEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public SysTimeZone findEntity(SysTimeZone model) throws Exception {
		try {
			log.info("findEntity");
			return sysTimeZoneMapper.findEntity(model);
		} catch(Exception e) {
			log.info("findEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public List<SysTimeZone> findEntityList(SysTimeZone model) throws Exception {
		try {
			log.info("findEntityList");
			return sysTimeZoneMapper.findEntityList(model);
		} catch(Exception e) {
			log.info("findEntityList异常");
			e.printStackTrace();
			throw e;
		}
	}

}
