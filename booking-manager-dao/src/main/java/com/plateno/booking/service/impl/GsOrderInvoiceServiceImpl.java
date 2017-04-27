package com.plateno.booking.service.impl;

import com.plateno.booking.model.GsOrderInvoice;
import com.plateno.booking.mapper.GsOrderInvoiceMapper;
import com.plateno.booking.service.GsOrderInvoiceService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
@Service("gsOrderInvoiceService")
public class GsOrderInvoiceServiceImpl implements GsOrderInvoiceService {

	private Logger log = Logger.getLogger(GsOrderInvoiceServiceImpl.class);

	@Autowired
	private GsOrderInvoiceMapper gsOrderInvoiceMapper;

	@Override
	public int addEntity(GsOrderInvoice model) throws Exception {
		try {
			log.info("addEntity");
			gsOrderInvoiceMapper.addEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("addEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int deleteEntity(GsOrderInvoice model) throws Exception {
		try {
			log.info("deleteEntity");
			return gsOrderInvoiceMapper.deleteEntity(model);
		} catch(Exception e) {
			log.info("deleteEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int updateEntity(GsOrderInvoice model) throws Exception {
		try {
			log.info("updateEntity");
			gsOrderInvoiceMapper.updateEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("updateEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public GsOrderInvoice findEntity(GsOrderInvoice model) throws Exception {
		try {
			log.info("findEntity");
			return gsOrderInvoiceMapper.findEntity(model);
		} catch(Exception e) {
			log.info("findEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public List<GsOrderInvoice> findEntityList(GsOrderInvoice model) throws Exception {
		try {
			log.info("findEntityList");
			return gsOrderInvoiceMapper.findEntityList(model);
		} catch(Exception e) {
			log.info("findEntityList异常");
			e.printStackTrace();
			throw e;
		}
	}

}
