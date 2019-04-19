package xcls.user.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import xcls.user.server.domain.User;
import xcls.user.server.service.UserService;

/**
 * 用户相关Controller.
 * @author jamine
 *
 */
@RestController
public class UserController {
	
	
	@Autowired
	UserService userService;
	/**
	 * 根据ID获取用户信息.
	 * @return
	 */
	@RequestMapping("/getAllUsers")
	public String getAllUsers() {
		return userService.selectByPrimaryKey(1).toString();
	}
	/**
	 * 往数据库加一条用户数据,
	 * 
	 * @param registerUUID
	 * @return
	 */
	@RequestMapping(value = "/userRegister", method = RequestMethod.POST, consumes = "application/json")
	@ResponseBody
	public String userRegister(@RequestBody User userRegisterVo) {
		User addUser = new User();
		
		addUser.setUserName(userRegisterVo.getUserName());
		addUser.setPassword(userRegisterVo.getPassword());
		addUser.setBizSystem("k8cp");
		return null;
	}
}
