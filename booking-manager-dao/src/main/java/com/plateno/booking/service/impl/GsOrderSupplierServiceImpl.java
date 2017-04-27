package com.plateno.booking.service.impl;

import com.plateno.booking.model.GsOrderSupplier;
import com.plateno.booking.mapper.GsOrderSupplierMapper;
import com.plateno.booking.service.GsOrderSupplierService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:21
 */
@Service("gsOrderSupplierService")
public class GsOrderSupplierServiceImpl implements GsOrderSupplierService {

	private Logger log = Logger.getLogger(GsOrderSupplierServiceImpl.class);

	@Autowired
	private GsOrderSupplierMapper gsOrderSupplierMapper;

	@Override
	public int addEntity(GsOrderSupplier model) throws Exception {
		try {
			log.info("addEntity");
			gsOrderSupplierMapper.addEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("addEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int deleteEntity(GsOrderSupplier model) throws Exception {
		try {
			log.info("deleteEntity");
			return gsOrderSupplierMapper.deleteEntity(model);
		} catch(Exception e) {
			log.info("deleteEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int updateEntity(GsOrderSupplier model) throws Exception {
		try {
			log.info("updateEntity");
			gsOrderSupplierMapper.updateEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("updateEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public GsOrderSupplier findEntity(GsOrderSupplier model) throws Exception {
		try {
			log.info("findEntity");
			return gsOrderSupplierMapper.findEntity(model);
		} catch(Exception e) {
			log.info("findEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public List<GsOrderSupplier> findEntityList(GsOrderSupplier model) throws Exception {
		try {
			log.info("findEntityList");
			return gsOrderSupplierMapper.findEntityList(model);
		} catch(Exception e) {
			log.info("findEntityList异常");
			e.printStackTrace();
			throw e;
		}
	}

}
