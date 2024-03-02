package com.projects.modular.healthPlatform.model.params;

import lombok.Data;
import cn.stylefeng.roses.kernel.model.validator.BaseValidatingParam;
import java.util.Date;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 注册用户
 * </p>
 *
 * @author demo
 * @since 2023-12-01
 */
@Data
public class RegisteredUsersParam implements Serializable, BaseValidatingParam {

    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */
    private Long userId;

    /**
     * 姓名
     */
    private String name;

    /**
     * 密码
     */
    private String passWord;

    /**
     * 用户
     */
    private String userName;

    /**
     * 头像
     */
    private String pic;

    private String address;
    @Override
    public String checkParam() {
        return null;
    }

}
