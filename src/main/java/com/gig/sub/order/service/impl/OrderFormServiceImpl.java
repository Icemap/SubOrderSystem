package com.gig.sub.order.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gig.sub.order.bean.ResultBean;
import com.gig.sub.order.dao.OrderFormMapper;
import com.gig.sub.order.pojo.OrderForm;
import com.gig.sub.order.service.OrderFormService;

@Service
public class OrderFormServiceImpl implements OrderFormService
{
	@Autowired
	OrderFormMapper orderFormMapper;
	
	@Override
	public ResultBean addOrderForm(OrderForm orderForm)
	{
		return ResultBean.tokenKeyValid(orderFormMapper.insertSelective(orderForm) == 1);
	}

	@Override
	public ResultBean getOrderFormByOrderUserId(Integer orderUserId)
	{
		return ResultBean.tokenKeyValid(orderFormMapper.selectByOrderUserId(orderUserId));
	}

	@Override
	public ResultBean updateOrderForm(OrderForm orderForm)
	{
		return ResultBean.tokenKeyValid(orderFormMapper.updateByPrimaryKeySelective(orderForm) == 1);
	}

	@Override
	public ResultBean deleteOrderForm(Integer orderFormId)
	{
		return ResultBean.tokenKeyValid(orderFormMapper.deleteByPrimaryKey(orderFormId) == 1);
	}
}
