package com.example.demo_herokubackend.controller;

import com.example.demo_herokubackend.model.SysUser;
import com.example.demo_herokubackend.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @GetMapping("/")
    public String hello() {
        return "Hello men!!";
    }

    @Autowired
    private SysUserService sysUserService;

    @PostMapping()
    public SysUser save(@RequestBody SysUser sysUser) {
        return sysUserService.save(sysUser);
    }

    @GetMapping()
    public List<SysUser> getAllSysUser() {
        return sysUserService.getAll();
    }
}
