package com.atguigu.common.to;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @auther heling
 * @date 2021/11/9
 */
@Data
public class SpuBoundTo {
    private Long spuId;
    private BigDecimal buyBound;
    private BigDecimal growBounds;
}
