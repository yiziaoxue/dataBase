package com.plateno.booking.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.plateno.booking.bean.GetOrderDetailParam;
import com.plateno.booking.model.GsOrderInn;
import com.plateno.booking.model.ResultVO;
import com.plateno.booking.service.IBookingService;

/**
* @author zhenhua.chun 
* @version 2016年7月28日 下午4:31:55
* @Description
*/
@RestController
@RequestMapping("/")
public class BookingServiceController{
	
	private static Logger log = Logger.getLogger(BookingServiceController.class);
	
	@Autowired
	private IBookingService bookingService;
	
	@RequestMapping(value="entry",method=RequestMethod.GET)
	public String entrySystem(){
		log.info("进入系统");
		ModelAndView mv = new ModelAndView("demo");
        return "demo";
	}
	
	@RequestMapping(value="getOrderDetail",method=RequestMethod.POST)
	public List<GsOrderInn> getOrderDetail(GetOrderDetailParam param){
		if((param.getOrderCode() == null || param.getOrderCode().equals(""))){
			return null;
		}
		ResultVO<List<GsOrderInn>> result = null;
		try {
			result = bookingService.doGetOrderDetail(param);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result.getData();
	}
	
}
