package com.atguigu.gulimall.ware.Vo;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @auther heling
 * @date 2021/11/14
 */
@Data
public class PurchaseDoneVo {

    @NotNull
    private Long id;

    private List<PurchaseItemDoneVo> items;
}
