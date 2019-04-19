package xcls.user.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户服务启动类.
 * 
 * @author jamine
 *
 */

@EnableEurekaClient
@ComponentScan(basePackages = {"xcls.user.server.**"})
@MapperScan("xcls.user.server.mapper.**")
@RestController
@SpringBootApplication
public class UserServerEurekaApplication {
	public static void main(String[] args) {
		SpringApplication.run(UserServerEurekaApplication.class, args);
	}

}
