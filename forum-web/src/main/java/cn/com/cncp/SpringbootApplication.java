package cn.com.cncp;


//import com.didispace.swagger.butler.EnableSwaggerButler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

//@EnableSwaggerButler
@SpringBootApplication
@MapperScan(basePackages = {"cn.com.cncp.mapper"})
public class SpringbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }
}
