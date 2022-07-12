package org.zerock.club.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.club.security.dto.ClubAuthMemberDTO;

@Controller
@Log4j2
@RequestMapping("/sample")
public class    SampleController {


    //모든 사용자 접근 가능
    @PreAuthorize("permitAll()")
    @GetMapping("/all")
    public void exAll(){}

    //USER권한이 있는 사람만 접근가능
    @PreAuthorize("hasRole('USER')")
    @GetMapping("/member")
    public void exMember(@AuthenticationPrincipal ClubAuthMemberDTO clubAuthMember){
        log.info("로그인한 사용자 정보 : "+clubAuthMember);
    }

    //관리자 접근 가능
    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public void exAdmin(){}

    //로그인한 사람만 접근가능
    @GetMapping("/main")
    @PreAuthorize("isAuthenticated()")
    public void exMain(){}

    //특정 user만 접근가능
    @PreAuthorize("#clubAuthMember!=null && #clubAuthMember.username eq \"user95@zerock.org\"")
    @GetMapping("/exOnly")
    public String exMemberOnly(@AuthenticationPrincipal ClubAuthMemberDTO clubAuthMember){
        return "redirect:/sample/admin";
    }

    //loginCustom
    @GetMapping("/loginCustom")
    public void loginCustom(){}

    //ajax csrf token 테스트
    @GetMapping("/ajax")
    public void ajax(){}
}
