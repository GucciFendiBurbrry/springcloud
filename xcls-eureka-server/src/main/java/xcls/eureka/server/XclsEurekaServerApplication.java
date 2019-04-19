package xcls.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册服务中心.
 * 
 * @author jamine
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class XclsEurekaServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(XclsEurekaServerApplication.class, args);
	}
}
