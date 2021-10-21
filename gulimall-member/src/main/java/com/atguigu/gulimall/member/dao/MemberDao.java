package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author heling
 * @email 929926540@qq.com
 * @date 2021-10-21 10:35:35
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
