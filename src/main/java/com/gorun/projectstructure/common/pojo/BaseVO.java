package com.gorun.projectstructure.common.pojo;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

/**
 * @author go run
 * @Description: 基础VO类
 * @date 2020/5/14 23:10
 */
public class BaseVO implements Serializable {

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
