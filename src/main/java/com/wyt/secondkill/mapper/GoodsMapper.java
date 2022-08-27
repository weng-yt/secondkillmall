package com.wyt.secondkill.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wyt.secondkill.entity.Goods;
import com.wyt.secondkill.vo.GoodsVo;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author hexiangdong
 * @since 2022-03-07
 */
public interface GoodsMapper extends BaseMapper<Goods> {

    List<GoodsVo> getGoodsVo();

    GoodsVo getGoodsVoById(Long goodsId);
}
