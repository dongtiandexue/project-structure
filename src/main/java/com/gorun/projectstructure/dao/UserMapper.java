package com.gorun.projectstructure.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gorun.projectstructure.pojo.po.UserPO;
import org.springframework.stereotype.Repository;

/**
 * 用户 Mapper
 * @author go run
 */
@Repository
public interface UserMapper extends BaseMapper<UserPO> {
}
