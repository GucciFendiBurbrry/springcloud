package xcls.feign.server;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	IUserService userService;

	/**
	 * 获取用户信息.
	 * @return
	 */
	@RequestMapping(value = "/getAllUsers", method = RequestMethod.GET)
	public String sayHello() {
		return userService.getAllUsers();
	}
	
	/**
	 * 用户注册.
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/userRegister", method = RequestMethod.GET)
	public String userRegister(User user) {
		return userService.getAllUsers();
	}
}
