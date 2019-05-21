package cn.com.cncp.auth.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

/**
 * 资源服务器
 */
@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {
    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
        super.configure(resources);
    }

    /**
     * 用于配置对受保护的资源的访问规则
     * 默认情况下所有不在/oauth/**下的资源都是受保护的资源
     * requestMatchers():添加匹配规则
     * formLogin():该方法是用于配置登录相关的设置的
     */
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.requestMatchers().antMatchers("/haha/**")
//                .and().formLogin().usernameParameter("username") // default is username
//                .passwordParameter("password") // default is password
//                .loginPage("/authentication/login") // default is /login with an HTTP get
//                .failureUrl("/authentication/login?failed") // default is /login?error
//                .loginProcessingUrl("/authentication/login/process")
                .and()
                .authorizeRequests()
                .anyRequest().authenticated();
    }
}
