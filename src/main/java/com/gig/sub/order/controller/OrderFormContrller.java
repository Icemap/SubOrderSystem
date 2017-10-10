package com.gig.sub.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gig.sub.order.bean.ResultBean;
import com.gig.sub.order.pojo.OrderForm;
import com.gig.sub.order.service.impl.OrderFormServiceImpl;

@Controller
@RequestMapping("/orderForm")
public class OrderFormContrller
{
	@Autowired
	OrderFormServiceImpl orderFormServiceImpl;
	
	@ResponseBody
	@RequestMapping("/addOrderForm.perm")
	ResultBean addOrderForm(String name, String des, Integer mainUserId, 
			String srcDir, String status, Integer orderUserId) 
	{
		OrderForm orderForm = new OrderForm();
		orderForm.setName(name);
		orderForm.setDes(des);
		orderForm.setMainUserId(mainUserId);
		orderForm.setOrderUserId(orderUserId);
		orderForm.setSrcDir(srcDir);
		orderForm.setStatus(status);
		
		return orderFormServiceImpl.addOrderForm(orderForm);
	}
}
