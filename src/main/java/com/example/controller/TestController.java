package com.example.controller;


import com.example.model.Test;
import com.example.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author lzy
 * @since 2019-10-13
 */
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("test")
    public List<Test> test() {
        return testService.getall();
    }
}

