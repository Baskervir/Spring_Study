package com.example.Spring_Study.controller;

import com.example.Spring_Study.dto.MemberForm;
import com.example.Spring_Study.entity.Member;
import com.example.Spring_Study.repository.MemberRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class MemberController {
    private static final Logger log = LoggerFactory.getLogger(MemberController.class);
    @Autowired
    MemberRepository memberRepository;

    @GetMapping("/signup")
    public String newMemberForm() {
        return "members/new";
    }

    @PostMapping("/join")
    public String join(MemberForm memberForm) {
        log.info(memberForm.toString());
//        System.out.println(memberForm.toString());

        Member member = memberForm.toEntity();
        log.info(member.toString());
//        System.out.println(member.toString());

        Member saved = memberRepository.save(member);
        log.info(saved.toString());
//        System.out.println(saved.toString());
        return "";
    }
}
