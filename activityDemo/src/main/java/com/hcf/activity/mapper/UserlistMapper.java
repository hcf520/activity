package com.hcf.activity.mapper;

import com.hcf.activity.entity.Userlist;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author hcf
 * @since 2019-12-05
 */
@DS("db2-slave")
@Mapper
public interface UserlistMapper extends BaseMapper<Userlist> {

}
