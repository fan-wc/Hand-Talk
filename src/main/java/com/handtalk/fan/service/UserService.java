package com.handtalk.fan.service;

import com.handtalk.fan.models.User;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public interface UserService {
    public User  userLogin(String passwordOrEmail,String passwordOrCode);
    public Map userRegister(User user);
    public Map userRegisterByCode(User user,HttpServletRequest request);
    public User updateUser(User user);
}
