package com.caiwei.object.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.caiwei.object.entities.model.User;
import com.caiwei.object.service.UserService;
import com.caiwei.object.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author caiwei
* @description 针对表【user】的数据库操作Service实现
* @createDate 2024-06-04 12:50:03
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService {

}




