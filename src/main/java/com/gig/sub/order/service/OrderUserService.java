package com.gig.sub.order.service;

import com.gig.sub.order.bean.ResultBean;
import com.gig.sub.order.pojo.OrderUser;

public interface OrderUserService
{
	ResultBean addOrderUser(OrderUser orderUser);
	ResultBean deleteOrderUser(Integer orderUserId);
	ResultBean updateOrderUser(OrderUser orderUser);
	ResultBean getFreeOrderUserList();
	ResultBean getFreeOrderTopScoreUser();
}
