package com.gig.sub.order.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gig.sub.order.bean.ResultBean;
import com.gig.sub.order.dao.OrderUserMapper;
import com.gig.sub.order.pojo.OrderUser;
import com.gig.sub.order.service.OrderUserService;

@Service
public class OrderUserServiceImpl implements OrderUserService
{
	@Autowired
	OrderUserMapper orderUserMapper;
	
	@Override
	public ResultBean addOrderUser(OrderUser orderUser)
	{
		return ResultBean.tokenKeyValid(orderUserMapper.insertSelective(orderUser) == 1);
	}

	@Override
	public ResultBean deleteOrderUser(Integer orderUserId)
	{
		return ResultBean.tokenKeyValid(orderUserMapper.deleteByPrimaryKey(orderUserId) == 1);
	}

	@Override
	public ResultBean updateOrderUser(OrderUser orderUser)
	{
		return ResultBean.tokenKeyValid(orderUserMapper.updateByPrimaryKeySelective(orderUser) == 1);
	}

	@Override
	public ResultBean getFreeOrderUserList()
	{
		return ResultBean.tokenKeyValid(orderUserMapper.selectFreeList());
	}

	@Override
	public ResultBean getFreeOrderTopScoreUser()
	{
		return ResultBean.tokenKeyValid(orderUserMapper.selectFree());
	}

}
