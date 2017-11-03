package com.lgt.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lgt
 * @date 2017年11月2日09:54:59
 */
@Controller
@RequestMapping(value = "")
public class IndexController {

    @RequestMapping(value = "")
    private ModelAndView test() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index2");
        Map map = new HashMap();
        map.put("data", 1);
        modelAndView.addAllObjects(map);
        return modelAndView;
    }
}
