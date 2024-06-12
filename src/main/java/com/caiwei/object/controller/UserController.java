package com.caiwei.object.controller;

import com.caiwei.object.entities.model.User;
import com.caiwei.object.entities.dto.UserDTO;
import com.caiwei.object.entities.vo.UserVO;
import com.caiwei.object.response.Result;
import com.caiwei.object.service.UserService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class UserController {
    @Resource
    private UserService userService;

    /**
     * 添加用户
     *
     * @param userDTO
     * @return
     */
    @PostMapping("/add")
    public Result save(@RequestBody UserDTO userDTO) {
        log.info("user = " + userDTO);
        User user = new User();
        BeanUtils.copyProperties(userDTO, user);
        boolean save = userService.save(user);
        if (save) {
            return Result.success();
        } else {
            return Result.error("添加用户失败");
        }

    }

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

    @DeleteMapping("/del/{id}")
    public Result deleteById(@PathVariable("id") Integer id) {
        boolean remove = userService.removeById(id);
        if (remove) {
            return Result.success();
        } else {
            return Result.error("删除失败");
        }
    }

}
