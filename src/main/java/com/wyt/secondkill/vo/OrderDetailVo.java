package com.wyt.secondkill.vo;

import com.wyt.secondkill.entity.Order;
import lombok.Data;

@Data
public class OrderDetailVo {

    private Order order;
    private GoodsVo goodsVo;
}
