package com.controller;

import com.service.ProfessionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class TestController {
    @Resource
    private ProfessionService service;

    @GetMapping("/demo")
    @ResponseBody
    public String dfsf() {

        return "秋哥真帅！";
    }
}
