package com.atguigu.gulimall.ware.Vo;

import lombok.Data;

import java.util.List;

/**
 * @auther heling
 * @date 2021/11/13
 */
@Data
public class MergeVo {

    private Long purchaseId;  //整单id
    private List<Long> items; //合并项集合
}
