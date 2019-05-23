package cn.com.cncp.auth.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * 配置Security
 * WebSecurity主要是配置咱们这个项目的一些安全配置，比如用户、认证、授权等等。
 *
 * authorizeRequests()：该方法允许基于HttpServletRequest进行访问限制，比如角色、权限
 * formLogin()：用于配置登录相关的设置
 * requestMatchers()：这个方法是用于限定只有特定的HttpServletRequest实例才会导致该HttpSecurity被调用，当然是通过请求uri进行限定的了。它后面可以接多个匹配规则
 *
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, proxyTargetClass = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("zhangsan")
                .password("$2a$10$BMbN.S35uqH2QtUaU5/qwuRxY0xdvIOjirCmuVeEhyWnz1VSjB1e6")
                .roles("USER");
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/css/**", "/js/**", "/plugins/**", "/favicon.ico");
    }

    /**
     * authorizeRequests:权限限制认证
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //默认的所有请求都要授权，并且指定登登录的uri是/login,同时支持Basic认证
//        http.authorizeRequests().anyRequest().authenticated().and().formLogin().and().httpBasic();
//        http.authorizeRequests().antMatchers("/admin/**").hasRole("ADMIN")
//                .antMatchers("/**").hasRole("USER").and().formLogin();
        super.configure(http);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


    public static void main(String[] args) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        System.out.println(bCryptPasswordEncoder.encode("123456"));
        System.out.println(bCryptPasswordEncoder.encode("12345678"));
    }
}
