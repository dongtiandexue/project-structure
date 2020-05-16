package com.gorun.projectstructure.pojo.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.gorun.projectstructure.common.pojo.BaseVO;
import lombok.Data;

/**
 * @author go run
 * @Description: User VO 类
 * @date 2020/5/14 23:13
 */
@Data
public class UserVO extends BaseVO {

    private String id;

    private String username;

    private String email;

    private String phone;

    private String password;
}
