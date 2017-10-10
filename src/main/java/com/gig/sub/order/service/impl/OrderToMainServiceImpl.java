package com.gig.sub.order.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gig.sub.order.bean.ResultBean;
import com.gig.sub.order.dao.OrderToMainMapper;
import com.gig.sub.order.pojo.OrderToMain;
import com.gig.sub.order.service.OrderToMainService;

@Service
public class OrderToMainServiceImpl implements OrderToMainService
{
	@Autowired
	OrderToMainMapper orderToMainMapper;
	
	@Override
	public ResultBean addOrderToMain(OrderToMain orderToMain)
	{
		return ResultBean.tokenKeyValid(orderToMainMapper.insertSelective(orderToMain) == 1);
	}

	@Override
	public ResultBean updateOrderToMain(OrderToMain orderToMain)
	{
		return ResultBean.tokenKeyValid(orderToMainMapper.updateByPrimaryKeySelective(orderToMain) == 1);
	}

	@Override
	public ResultBean selectOrderToMain(Integer mainUserId)
	{
		return ResultBean.tokenKeyValid(orderToMainMapper.selectByPrimaryKey(mainUserId));
	}
}
