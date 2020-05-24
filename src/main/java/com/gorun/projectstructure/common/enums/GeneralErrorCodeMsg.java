package com.gorun.projectstructure.common.enums;

/**
 * @author Running boy
 * @Description: 统一错误信息返回枚举
 * 001 系统类错误
 * @date 2020/5/25 0:04
 */
public enum GeneralErrorCodeMsg {
    SYSTEM_ERROR("001001","System error");

    private String code;

    private String msg;

    GeneralErrorCodeMsg(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
