package com.example.Spring_Study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/json")
public class JSONController {

    @PostMapping
    @ResponseBody
    public UserInfo handleJSONRequest(@RequestBody Map<String, String> request) {
        System.out.println(request);
        UserInfo info = new UserInfo(request.get("name"), Integer.parseInt(request.get("age")));
        return info;
    }

}