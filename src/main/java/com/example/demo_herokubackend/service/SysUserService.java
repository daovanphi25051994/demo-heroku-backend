package com.example.demo_herokubackend.service;

import com.example.demo_herokubackend.model.SysUser;
import com.example.demo_herokubackend.repository.SysUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserService {

    @Autowired
    private SysUserRepository sysUserRepository;

    public SysUser save(SysUser sysUser) {
        return sysUserRepository.save(sysUser);
    }

    public List<SysUser> getAll() {
        return sysUserRepository.findAll();
    }
}
