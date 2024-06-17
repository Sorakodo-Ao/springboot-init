package com.caiwei.object.controller;

import com.caiwei.object.context.BaseContext;
import com.caiwei.object.entities.dto.UserDTO;
import com.caiwei.object.entities.model.User;
import com.caiwei.object.entities.vo.UserVO;
import com.caiwei.object.response.Result;
import com.caiwei.object.service.UserService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;


    /**
     * 根据id查询用户
     *
     * @param id
     * @return
     */
    @GetMapping("/get/{id}")
    public Result<UserVO> getById(@PathVariable("id") Integer id) {
        User user = userService.getById(id);
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(user, userVO);
        return Result.success(userVO);
    }

    /**
     * 根据id删除用户
     *
     * @param id
     * @return
     */

    @DeleteMapping("/del/{id}")
    public Result deleteById(@PathVariable("id") Integer id) {
        boolean remove = userService.removeById(id);
        if (remove) {
            return Result.success("删除成功！");
        } else {
            return Result.error("删除失败");
        }
    }

    @PutMapping("/update")
    public Result updateUser(@RequestBody UserDTO userDTO) {
        User user = new User();
        BeanUtils.copyProperties(userDTO, user);
        boolean update = userService.updateById(user);
        if (update) {
            return Result.success("更新成功！");
        } else {
            return Result.error("删除失败");
        }
    }

}
