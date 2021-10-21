package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author heling
 * @email 929926540@qq.com
 * @date 2021-10-20 15:43:00
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
