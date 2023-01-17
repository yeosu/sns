package com.ceh.sns.controller;

import com.ceh.sns.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    private String userName = "userName";
    private String password = "password";

    //TODO : implement
    @PostMapping
    public void join(){
        userService.join(userName, password);
    }
}
