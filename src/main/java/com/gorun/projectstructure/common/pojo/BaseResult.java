package com.gorun.projectstructure.common.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Running boy
 * @Description: 统一返回实体类
 * @date 2020/5/25 0:02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseResult<T> {

    private Integer code;

    private String msg;

    private T data;

    public BaseResult(Integer code, String msg) {
        this(code, msg, null);
    }
}
