package com.plateno.booking.service;

import java.util.List;

import com.plateno.booking.bean.GetOrderDetailParam;
import com.plateno.booking.model.GsOrderInn;
import com.plateno.booking.model.ResultVO;

/**
* @author zhenhua.chun 
* @version 2016年12月8日 上午9:54:56
* @Description
*/
public interface IBookingService {
	/**
	 * 查询订单
	 * @param param
	 * @return
	 */
	public ResultVO<List<GsOrderInn>> doGetOrderDetail(GetOrderDetailParam param);
}
