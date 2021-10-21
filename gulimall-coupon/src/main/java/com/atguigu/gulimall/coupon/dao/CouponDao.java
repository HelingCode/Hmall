package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author heling
 * @email 929926540@qq.com
 * @date 2021-10-21 10:26:07
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
