package com.gig.sub.order.dao;

import java.util.List;

import com.gig.sub.order.pojo.OrderForm;

public interface OrderFormMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderForm record);

    int insertSelective(OrderForm record);

    OrderForm selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderForm record);

    int updateByPrimaryKey(OrderForm record);
    
    List<OrderForm> selectByOrderUserId(Integer orderUserId);
}