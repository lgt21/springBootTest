package com.lgt.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lgt
 * @date 2017年11月2日09:54:59
 */
@RestController
@RequestMapping(value = "test")
public class TestController {

    @RequestMapping(value = "")
    private String test() {
        return  "test";
    }
}
