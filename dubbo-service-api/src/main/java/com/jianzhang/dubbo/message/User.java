package com.jianzhang.dubbo.message;





import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description: 用户实体类
 * @author Jian Jang
 * @version 1.0 2018/2/2
 */
@Setter
@Getter
@NoArgsConstructor
@ToString
public class User implements Serializable {

    private static final long serialVersionUID = -6345406359654290738L;
    private Long id;

    private String username;

    private Date birthday;

    private String gender;

    private String email;

    private int age;
}
