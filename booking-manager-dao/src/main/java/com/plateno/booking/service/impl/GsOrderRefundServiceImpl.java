package com.plateno.booking.service.impl;

import com.plateno.booking.model.GsOrderRefund;
import com.plateno.booking.mapper.GsOrderRefundMapper;
import com.plateno.booking.service.GsOrderRefundService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
@Service("gsOrderRefundService")
public class GsOrderRefundServiceImpl implements GsOrderRefundService {

	private Logger log = Logger.getLogger(GsOrderRefundServiceImpl.class);

	@Autowired
	private GsOrderRefundMapper gsOrderRefundMapper;

	@Override
	public int addEntity(GsOrderRefund model) throws Exception {
		try {
			log.info("addEntity");
			gsOrderRefundMapper.addEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("addEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int deleteEntity(GsOrderRefund model) throws Exception {
		try {
			log.info("deleteEntity");
			return gsOrderRefundMapper.deleteEntity(model);
		} catch(Exception e) {
			log.info("deleteEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int updateEntity(GsOrderRefund model) throws Exception {
		try {
			log.info("updateEntity");
			gsOrderRefundMapper.updateEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("updateEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public GsOrderRefund findEntity(GsOrderRefund model) throws Exception {
		try {
			log.info("findEntity");
			return gsOrderRefundMapper.findEntity(model);
		} catch(Exception e) {
			log.info("findEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public List<GsOrderRefund> findEntityList(GsOrderRefund model) throws Exception {
		try {
			log.info("findEntityList");
			return gsOrderRefundMapper.findEntityList(model);
		} catch(Exception e) {
			log.info("findEntityList异常");
			e.printStackTrace();
			throw e;
		}
	}

}
