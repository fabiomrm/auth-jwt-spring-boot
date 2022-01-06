package com.avanade.dio.jwt.controller;

import com.avanade.dio.jwt.data.UserData;
import com.avanade.dio.jwt.service.UserDetailServiceImpl;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.avanade.dio.jwt.service.UserDetailServiceImpl;
import java.util.List;

@RestController
public class UserController {

    private final UserDetailServiceImpl userDetailService;

    public UserController(UserDetailServiceImpl userDetailService) {
        this.userDetailService = userDetailService;
    }



    @RequestMapping("/users")
    public List<UserData> listAllUsers() {
        return userDetailService.listUser();
    }
}
