package org.zerock.club.config;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.zerock.club.security.handler.ClubLoginSuccessHandler;
import org.zerock.club.security.service.ClubUserDetailsService;

@Configuration
@Log4j2
@EnableGlobalMethodSecurity(prePostEnabled = true,securedEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private ClubUserDetailsService userDetailsService;//주입

    // BCryptPasswordEncoder사용
    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
    //사용자 id, pw 등록. DB사용할 때는 필요없음
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
//        auth.inMemoryAuthentication().withUser("user1")
//                .password("$2a$10$ssORmsx8/FUSU2vOXdRoFuWlzMwCf.jsZcYVch1phHTZeSSxe9ZHq")
//                .roles("USER");
//    }

    // URL별 접근권한 설정. 로그인폼설정. csrf토큰 비활성화. 로그아웃폼설정
    @Override
    protected  void configure(HttpSecurity http) throws Exception{
        // @PreAuthorize 사용 추천
//        http.authorizeHttpRequests()
//                .antMatchers("/sample/all").permitAll()
//                .antMatchers("/sample/member").hasRole("USER");
//        http.formLogin();


//        http.formLogin().loginPage("/sample/loginCustom").loginProcessingUrl("/login");
        http.formLogin().loginPage("/sample/loginCustom").loginProcessingUrl("/login");
//        http.csrf().disable(); //csrf token 비활성화
        http.logout();

        http.oauth2Login().successHandler(successHandler()); // OAuth2 로그인 사용
        http.rememberMe().tokenValiditySeconds(60*60*24*7).userDetailsService(userDetailsService);//자동로그인

    }

    @Bean
    public ClubLoginSuccessHandler successHandler(){
        return new ClubLoginSuccessHandler(passwordEncoder());
    }
}
