package com.gig.sub.order.service;

import com.gig.sub.order.bean.ResultBean;
import com.gig.sub.order.pojo.OrderToMain;

public interface OrderToMainService
{
	ResultBean addOrderToMain(OrderToMain orderToMain);
	ResultBean updateOrderToMain(OrderToMain orderToMain);
	ResultBean selectOrderToMain(Integer mainUserId);
}
