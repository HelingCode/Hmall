package com.atguigu.gulimall.ware.Vo;

import lombok.Data;

/**
 * @auther heling
 * @date 2021/11/14
 */
@Data
public class PurchaseItemDoneVo {
    private Long itemId;
    private Integer status;
    private String reason;

}
