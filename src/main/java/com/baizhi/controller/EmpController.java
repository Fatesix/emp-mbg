package com.baizhi.controller;

import com.baizhi.entity.Emp;
import com.baizhi.mapper.EmpMapperss;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    EmpMapperss empMapper;

    @RequestMapping("/emp")
    public Emp queryOne() {
        return empMapper.selectByPrimaryKey(2);
        System.out.println("github");
    }
}
