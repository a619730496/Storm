package com.tzy.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "tzy")
public class DempController {

    @RequestMapping(value = "demo", method = RequestMethod.GET)
    @ResponseBody
    public String getTzy() {
        return "tzy";
    }

}