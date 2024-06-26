package com.caiwei.object.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.caiwei.object.entities.dto.UserDTO;
import com.caiwei.object.entities.model.User;

/**
 * @author caiwei
 * @description 针对表【user】的数据库操作Service
 * @createDate 2024-06-04 12:50:03
 */
public interface UserService extends IService<User> {

    boolean isNewUser(UserDTO userDTO);

    User loginCheck(UserDTO userDTO);
}
