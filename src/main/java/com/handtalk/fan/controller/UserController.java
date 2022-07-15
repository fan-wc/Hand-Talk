package com.handtalk.fan.controller;

import com.handtalk.fan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@ResponseBody
@RequestMapping("/user")
@CrossOrigin
public class UserController {
    @Autowired
    UserService userService;


    @RequestMapping("/regist")
    public Map register(HttpServletRequest request,@RequestBody Map<String, Object> map) {
        Map resMap = new HashMap();

        return resMap;
    }

    @RequestMapping("/registByCode")
    public Map registerByCode(HttpServletRequest request,@RequestBody Map<String, Object> map) {
        Map resMap = new HashMap();

        return resMap;
    }
}
