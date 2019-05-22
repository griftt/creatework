package com.griftt.biz.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.griftt.biz.entity.Activity;

import java.util.List;

/**
 * <p>
 * 众测与活动 Mapper 接口
 * </p>
 *
 * @author griftt
 * @since 2019-04-19
 */
public interface ActivityMapper extends BaseMapper<Activity> {
    List<Activity> getActivity();
}

