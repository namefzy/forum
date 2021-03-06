package cn.com.cncp.auth.web;

import cn.com.cncp.auth.domain.UserInfo;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/oauth")
public class OauthController {

    @GetMapping("/sayHello")
    public String sayHello(String name) {
        return "Hello, " + name;
    }

    @PreAuthorize("hasAnyRole('ADMIN')")
    @RequestMapping("/sayHi")
    public String sayHi() {
        return "hahaha";
    }

    @RequestMapping("/userInfo")
    public UserInfo userInfo(Principal principal) {
        UserInfo userInfo = new UserInfo();
        userInfo.setName(principal.getName());
        return userInfo;
    }
}
