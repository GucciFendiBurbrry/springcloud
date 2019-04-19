package xcls.feign.server;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(name = "USER-SERVICE")
public interface IUserService {
	/**
	 * 获取用户注册信息
	 * @return
	 */
	@RequestMapping(value = "/getAllUsers", method = RequestMethod.GET)
	String getAllUsers();
	
	@RequestMapping(value = "/userRegister", method = RequestMethod.POST)
	String userRegister();
	
}
