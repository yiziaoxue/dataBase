package com.plateno.booking.service.impl;

import com.plateno.booking.model.SysArea;
import com.plateno.booking.mapper.SysAreaMapper;
import com.plateno.booking.service.SysAreaService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:21
 */
@Service("sysAreaService")
public class SysAreaServiceImpl implements SysAreaService {

	private Logger log = Logger.getLogger(SysAreaServiceImpl.class);

	@Autowired
	private SysAreaMapper sysAreaMapper;

	@Override
	public int addEntity(SysArea model) throws Exception {
		try {
			log.info("addEntity");
			sysAreaMapper.addEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("addEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int deleteEntity(SysArea model) throws Exception {
		try {
			log.info("deleteEntity");
			return sysAreaMapper.deleteEntity(model);
		} catch(Exception e) {
			log.info("deleteEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int updateEntity(SysArea model) throws Exception {
		try {
			log.info("updateEntity");
			sysAreaMapper.updateEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("updateEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public SysArea findEntity(SysArea model) throws Exception {
		try {
			log.info("findEntity");
			return sysAreaMapper.findEntity(model);
		} catch(Exception e) {
			log.info("findEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public List<SysArea> findEntityList(SysArea model) throws Exception {
		try {
			log.info("findEntityList");
			return sysAreaMapper.findEntityList(model);
		} catch(Exception e) {
			log.info("findEntityList异常");
			e.printStackTrace();
			throw e;
		}
	}

}
