package com.atguigu.gulimall.member.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @auther heling
 * @date 2021/10/21
 */
/**
 * 1.想要远程调用别的服务
 *  1）引入openfeign
 *  2) 编写一个接口，告诉springCloud这个接口需要调用远程服务
 *     1.声明接口的每一个方法都是调用哪个远程服务的哪个请求
 *  3）开启远程调用功能 @EnableFeignClients
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();
}
