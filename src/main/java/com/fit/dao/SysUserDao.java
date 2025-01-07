package com.fit.dao;

import com.fit.base.BaseCrudDao;
import com.fit.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * @AUTO 用户表接口
 * @Author AIM
 * @DATE 2025-01-08 01:14:13
 */
@Mapper
public interface SysUserDao extends BaseCrudDao<SysUser> {
}