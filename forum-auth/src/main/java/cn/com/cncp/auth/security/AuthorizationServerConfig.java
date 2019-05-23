package cn.com.cncp.auth.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStore;

/**
 * 授权服务器
 */
@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {
    /**
     * inMemory:存储客户端信息
     * withClient：客户端id
     * secret:客户端密钥
     * authorizedGrantTypes：该client允许的授权类型
     * scopes:允许的授权范围
     * @param clients
     * @throws Exception
     * 测试：
     * #（该步骤为**授权码模式中的A**），需要附上客户端申请认证的参数（**A步骤中所包含的参数**）
     * localhost:8081/oauth/authorize?client_id=client&response_type=code&redirect_uri=http://www.baidu.com
     */
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        //添加客户端信息
        clients.inMemory()                 // 使用in-memory存储客户端信息
                .withClient("client")       // client_id
                .secret("secret")                   // client_secret
                .authorizedGrantTypes("authorization_code")     // 该client允许的授权类型
                .scopes("app")
                .redirectUris("http://www.baidu.com");//注册
    }
    /*@Autowired
    private RedisConnectionFactory connectionFactory;
    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
        super.configure(security);
    }

    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory()
                .withClient("my-client-1")
                .secret("$2a$10$0jyHr4rGRdQw.X9mrLkVROdQI8.qnWJ1Sl8ly.yzK0bp06aaAkL9W")
                .authorizedGrantTypes("authorization_code", "refresh_token")
                .scopes("all")
                .redirectUris("http://www.baidu.com");
    }

    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        super.configure(endpoints);
    }
    @Bean
    public TokenStore tokenStore() {
        return new RedisTokenStore(connectionFactory);
    }
    */
    public static void main(String[] args) {
        System.out.println(new org.apache.tomcat.util.codec.binary.Base64().encodeAsString("my-client-1:12345678".getBytes()));
        System.out.println(java.util.Base64.getEncoder().encodeToString("my-client-1:12345678".getBytes()));
    }
}
