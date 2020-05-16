package com.gorun.projectstructure.pojo.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gorun.projectstructure.common.pojo.BasePropertyPO;
import lombok.Data;

/**
 * @author go run
 * @Description: User PO 类
 * @date 2020/5/14 23:08
 */
@Data
@TableName("user")
public class UserPO extends BasePropertyPO {

    @TableField("username")
    private String username;

    @TableField("email")
    private String email;

    @TableField("phone")
    private String phone;

    @TableField("password")
    private String password;
}
