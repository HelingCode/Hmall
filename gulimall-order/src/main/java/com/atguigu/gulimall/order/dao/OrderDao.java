package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author heling
 * @email 929926540@qq.com
 * @date 2021-10-21 10:46:34
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
