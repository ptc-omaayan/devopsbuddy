package com.devopsbuddy.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by omaayan on 11/29/2016.
 */

@Controller
public class IndexController {

    @RequestMapping("/")
    public String home(){
        return "index";
    }
}
