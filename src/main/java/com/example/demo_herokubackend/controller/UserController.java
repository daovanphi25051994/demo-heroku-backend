package com.example.demo_herokubackend.controller;

import com.example.demo_herokubackend.model.SysUser;
import com.example.demo_herokubackend.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/sys-user")
@RestController
public class UserController {

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
