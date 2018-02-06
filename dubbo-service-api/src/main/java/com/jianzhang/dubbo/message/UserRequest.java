package com.jianzhang.dubbo.message;

import lombok.*;

import java.io.Serializable;

/**
 * @Description: 请求参数实体类
 * @author Jian Jang
 * @version 1.0 2018/2/2
 */
@Setter
@Getter
@NoArgsConstructor
@ToString
public class UserRequest implements Serializable {

    private static final long serialVersionUID = -8731220151247196105L;
    private Long id;

    private String username;


}
