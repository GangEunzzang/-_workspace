package org.zerock.club.security.handler;

import lombok.extern.log4j.Log4j2;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.zerock.club.security.dto.ClubAuthMemberDTO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Log4j2
public class ClubLoginSuccessHandler implements AuthenticationSuccessHandler {
    private RedirectStrategy redirectStrategy=new DefaultRedirectStrategy(); //redirect객체
    private PasswordEncoder passwordEncoder; // password encoder

    public ClubLoginSuccessHandler(PasswordEncoder passwordEncoder){
        this.passwordEncoder=passwordEncoder;
    }

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        ClubAuthMemberDTO authMember=(ClubAuthMemberDTO)authentication.getPrincipal();//로그인한 사용자 정보 DTO에 저장
        boolean fromSocial= authMember.isFromSocial(); //social로그인 여부
        log.info(request.getParameter("password"));
        boolean passwordResult=passwordEncoder.matches("1111",authMember.getPassword());
        if(fromSocial && passwordResult){
            redirectStrategy.sendRedirect(request,response,"/member/modify?from=social");
        }

    }
}
