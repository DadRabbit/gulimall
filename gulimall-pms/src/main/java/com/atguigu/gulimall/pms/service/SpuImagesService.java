package com.atguigu.gulimall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gulimall.pms.entity.SpuImagesEntity;
import com.atguigu.gulimall.commons.bean.PageVo;
import com.atguigu.gulimall.commons.bean.QueryCondition;


/**
 * spu图片
 *
 * @author leifengyang
 * @email lfy@atguigu.com
 * @date 2020-10-03 06:39:43
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageVo queryPage(QueryCondition params);
}

