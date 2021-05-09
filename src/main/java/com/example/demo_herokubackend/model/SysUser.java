package com.example.demo_herokubackend.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class SysUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

}
