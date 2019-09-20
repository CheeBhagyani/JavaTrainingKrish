package chee.spring.smsui.controller;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableOAuth2Sso
public class UIController extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.authorizeRequests()
                .antMatchers("/")
                .permitAll()
                .anyRequest()
                .authenticated();
    }

    @RequestMapping(value = "/")
    public String loadHome() {
        return "home";
    }

    @RequestMapping(value = "/index")
    public String loadIndex() {
        return "index";
    }

    @RequestMapping(value = "/create")
    public String loadCreate() {
        return "create";
    }

    @RequestMapping(value = "/search")
    public String loadSearch() {
        return "search";
    }

    @RequestMapping(value = "/student_details")
    public String loadDetails() {
        return "student_details";
    }
}