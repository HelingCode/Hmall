package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * εεεΊε­
 * 
 * @author heling
 * @email 929926540@qq.com
 * @date 2021-10-21 10:54:20
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {

    void addStock(@Param("skuId") Long skuId,
                  @Param("wareId") Long wareId,
                  @Param("skuNum") Integer skuNum);

    Long getSkuStock(Long skuId);
}
