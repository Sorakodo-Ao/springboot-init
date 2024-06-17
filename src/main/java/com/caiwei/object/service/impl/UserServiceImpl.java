package com.caiwei.object.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.caiwei.object.entities.dto.UserDTO;
import com.caiwei.object.entities.model.User;
import com.caiwei.object.mapper.UserMapper;
import com.caiwei.object.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author caiwei
 * @description 针对表【user】的数据库操作Service实现
 * @createDate 2024-06-04 12:50:03
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
        implements UserService {

    @Resource
    private UserMapper userMapper;

    /**
     * 注册时检查是否为已注册用户
     *
     * @param userDTO
     * @return
     */
    @Override
    public boolean isNewUser(UserDTO userDTO) {
        User user = userMapper.selectByCondition(userDTO);
        if (user != null) {
            //用户已存在
            return false;
        }
        //不存在用户
        return true;
    }

    /**
     * 登录检查用户是否存在
     * @param userDTO
     * @return
     */
    @Override
    public User loginCheck(UserDTO userDTO) {
        String password = userDTO.getPassword();
        String account = userDTO.getAccount();
        Map<String, Object> map = new HashMap<>();
        map.put("account", account);
        map.put("password", password);
        User user = userMapper.loginCheck(map);
        return user;
    }
}




