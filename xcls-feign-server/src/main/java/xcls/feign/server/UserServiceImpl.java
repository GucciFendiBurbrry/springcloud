package xcls.feign.server;

import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements IUserService {

	@Override
	public String getAllUsers() {
		System.out.println("获取用户接口出错!");
		return "获取用户接口出错!";
	}

	@Override
	public String userRegister() {
		System.out.println("用户注册失败");
		return "用户注册失败";
	}

}
