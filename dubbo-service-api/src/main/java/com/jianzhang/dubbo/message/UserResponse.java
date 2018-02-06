package com.jianzhang.dubbo.message;

import java.io.Serializable;
import java.util.List;

import lombok.*;

/**
 * @Description: 请求参数实体类
 * @author Jian Jang
 * @version 1.0 2018/2/2
 */
@Setter
@Getter
@NoArgsConstructor
@ToString
public class UserResponse implements Serializable {

	private static final long serialVersionUID = 144314515083364841L;
	List<User> userList;

}
