package com.wyt.secondkill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wyt.secondkill.entity.Order;
import com.wyt.secondkill.entity.User;
import com.wyt.secondkill.vo.GoodsVo;
import com.wyt.secondkill.vo.OrderDetailVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hexiangdong
 * @since 2022-03-07
 */
public interface IOrderService extends IService<Order> {

    Order seckill(User user, GoodsVo goodsVo);

    OrderDetailVo getDetail(Long orderId);

    String createPath(User user, Long goodsId);

    Boolean checkPath(User user, String path, Long goodsId);

    Boolean checkCptcha(User user, Long goodsId, String captcha);
}
