package com.plateno.booking.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plateno.booking.annotation.TargetDataSource;
import com.plateno.booking.bean.GetOrderDetailParam;
import com.plateno.booking.config.DynamicDataSourceContextHolder;
import com.plateno.booking.model.GsOrderInn;
import com.plateno.booking.model.ResultVO;
import com.plateno.booking.param.OrderInnParam;
import com.plateno.booking.service.GsOrderInnService;
import com.plateno.booking.service.IBookingService;

/**
* @author zhenhua.chun 
* @version 2016年12月8日 上午10:31:09
* @Description
*/
@Service("bookingService")
public class BookingServiceImpl implements IBookingService{

	@Autowired
	private GsOrderInnService gsOrderInnService;
	
	@Override
	@TargetDataSource()
	public ResultVO<List<GsOrderInn>> doGetOrderDetail(GetOrderDetailParam param) {
		ResultVO<List<GsOrderInn>> result = new ResultVO<List<GsOrderInn>>();
		OrderInnParam model = new OrderInnParam();
		if(param.getOrderCode() != null && !param.getOrderCode().equals(""))
			model.setOrderCode(param.getOrderCode());
		else{
			result.setResultCode("-1");
			result.setResultMsg("orderCode不能为空");
		}
		if(param.getMemberId() != null && !param.getMemberId().equals(""))
			model.setBkMebId(param.getMemberId());
		try {
			List<GsOrderInn> lstOrderInn = gsOrderInnService.findEntityList(model);
			if(lstOrderInn != null && lstOrderInn.size() > 0){
				result.setResultCode("0");
				result.setData(lstOrderInn);
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
