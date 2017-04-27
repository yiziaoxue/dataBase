package com.plateno.booking.service.impl;

import com.plateno.booking.model.GsOrderInnAsset;
import com.plateno.booking.mapper.GsOrderInnAssetMapper;
import com.plateno.booking.service.GsOrderInnAssetService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * mapper文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
@Service("gsOrderInnAssetService")
public class GsOrderInnAssetServiceImpl implements GsOrderInnAssetService {

	private Logger log = Logger.getLogger(GsOrderInnAssetServiceImpl.class);

	@Autowired
	private GsOrderInnAssetMapper gsOrderInnAssetMapper;

	@Override
	public int addEntity(GsOrderInnAsset model) throws Exception {
		try {
			log.info("addEntity");
			gsOrderInnAssetMapper.addEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("addEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int deleteEntity(GsOrderInnAsset model) throws Exception {
		try {
			log.info("deleteEntity");
			return gsOrderInnAssetMapper.deleteEntity(model);
		} catch(Exception e) {
			log.info("deleteEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public int updateEntity(GsOrderInnAsset model) throws Exception {
		try {
			log.info("updateEntity");
			gsOrderInnAssetMapper.updateEntity(model);
			return 0;
		} catch(Exception e) {
			log.info("updateEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public GsOrderInnAsset findEntity(GsOrderInnAsset model) throws Exception {
		try {
			log.info("findEntity");
			return gsOrderInnAssetMapper.findEntity(model);
		} catch(Exception e) {
			log.info("findEntity异常");
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public List<GsOrderInnAsset> findEntityList(GsOrderInnAsset model) throws Exception {
		try {
			log.info("findEntityList");
			return gsOrderInnAssetMapper.findEntityList(model);
		} catch(Exception e) {
			log.info("findEntityList异常");
			e.printStackTrace();
			throw e;
		}
	}

}
