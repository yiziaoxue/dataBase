package com.plateno.booking.service.impl;

import com.plateno.booking.model.GsOrderInnBenefit;
import com.plateno.booking.mapper.GsOrderInnBenefitMapper;
import com.plateno.booking.service.GsOrderInnBenefitService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
@Service("gsOrderInnBenefitService")
public class GsOrderInnBenefitServiceImpl implements GsOrderInnBenefitService {

	private Logger log = Logger.getLogger(GsOrderInnBenefitServiceImpl.class);

	@Autowired
	private GsOrderInnBenefitMapper gsOrderInnBenefitMapper;

	@Override
	public int addEntity(GsOrderInnBenefit model) throws Exception {
		try {
			log.info("addEntity");
			gsOrderInnBenefitMapper.addEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("addEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int deleteEntity(GsOrderInnBenefit model) throws Exception {
		try {
			log.info("deleteEntity");
			return gsOrderInnBenefitMapper.deleteEntity(model);
		} catch(Exception e) {
			log.info("deleteEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int updateEntity(GsOrderInnBenefit model) throws Exception {
		try {
			log.info("updateEntity");
			gsOrderInnBenefitMapper.updateEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("updateEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public GsOrderInnBenefit findEntity(GsOrderInnBenefit model) throws Exception {
		try {
			log.info("findEntity");
			return gsOrderInnBenefitMapper.findEntity(model);
		} catch(Exception e) {
			log.info("findEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public List<GsOrderInnBenefit> findEntityList(GsOrderInnBenefit model) throws Exception {
		try {
			log.info("findEntityList");
			return gsOrderInnBenefitMapper.findEntityList(model);
		} catch(Exception e) {
			log.info("findEntityList异常");
			e.printStackTrace();
			throw e;
		}
	}

}
