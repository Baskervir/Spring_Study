package com.example.Spring_Study.controller;

import com.example.Spring_Study.dto.MemberForm;
import com.example.Spring_Study.entity.Member;
import com.example.Spring_Study.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {
    @Autowired
    MemberRepository memberRepository;

    @GetMapping("/signup")
    public String newMemberForm() {
        return "members/new";
    }

    @PostMapping("/join")
    public String join(MemberForm memberForm) {
        System.out.println(memberForm.toString());
        Member member = memberForm.toEntity();
        System.out.println(member.toString());
        Member saved = memberRepository.save(member);
        System.out.println(saved.toString());
        return "";
    }
}
