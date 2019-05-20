package com.griftt.biz.mapper;


import cn.stylefeng.roses.core.datascope.DataScope;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.griftt.biz.entity.Activity;
import com.griftt.biz.model.params.ActivityParam;
import com.griftt.biz.model.result.TryOutResult;

import org.apache.ibatis.annotations.Param;

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

