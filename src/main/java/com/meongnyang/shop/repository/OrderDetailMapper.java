package com.meongnyang.shop.repository;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderDetailMapper {
    int getCountAll();
    int deleteOrderDetailAll();
}
