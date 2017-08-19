package org.spring.springboot.controller;

import org.spring.springboot.domain.City;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: lgt
 * Date: 2017/8/18  18:18
 */
@RestController
@RequestMapping(value = "test")
public class TestController {

    @RequestMapping(value = "")
    private City test() {
        City city = new City();
        city.setCityName("测试  修改后");
        return city;
    }
}
