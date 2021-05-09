package com.example.demo_herokubackend.repository;

import com.example.demo_herokubackend.model.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SysUserRepository extends JpaRepository<SysUser, Long> {
}
