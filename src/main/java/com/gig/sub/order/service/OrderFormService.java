package com.gig.sub.order.service;

import com.gig.sub.order.bean.ResultBean;
import com.gig.sub.order.pojo.OrderForm;

public interface OrderFormService
{
	ResultBean addOrderForm(OrderForm orderForm);
	ResultBean getOrderFormByOrderUserId(Integer orderUserId);
	ResultBean updateOrderForm(OrderForm orderForm);
	ResultBean deleteOrderForm(Integer orderFormId);
}
