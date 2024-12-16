package com.example.Spring_Study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {
    @GetMapping("members/new")
    public String newMemberForm() {
        return "members/new";
    }

    @PostMapping("/members")
}
