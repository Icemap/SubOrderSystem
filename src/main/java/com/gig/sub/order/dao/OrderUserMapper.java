package com.gig.sub.order.dao;

import java.util.List;

import com.gig.sub.order.pojo.OrderUser;

public interface OrderUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderUser record);

    int insertSelective(OrderUser record);

    OrderUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderUser record);

    int updateByPrimaryKey(OrderUser record);

    OrderUser selectFree();
    
    List<OrderUser> selectFreeList();
}