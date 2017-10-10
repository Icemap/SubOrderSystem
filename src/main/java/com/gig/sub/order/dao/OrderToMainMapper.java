package com.gig.sub.order.dao;

import com.gig.sub.order.pojo.OrderToMain;

public interface OrderToMainMapper {
    int deleteByPrimaryKey(Integer mainUserId);

    int insert(OrderToMain record);

    int insertSelective(OrderToMain record);

    OrderToMain selectByPrimaryKey(Integer mainUserId);

    int updateByPrimaryKeySelective(OrderToMain record);

    int updateByPrimaryKey(OrderToMain record);
}