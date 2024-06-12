package com.caiwei.object.mapper;

import com.caiwei.object.entities.model.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author caiwei
* @description 针对表【user】的数据库操作Mapper
* @createDate 2024-06-04 12:50:03
* @Entity com.caiwei.object.entities.model.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




