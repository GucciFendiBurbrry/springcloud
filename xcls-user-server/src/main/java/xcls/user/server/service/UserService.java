package xcls.user.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xcls.user.server.domain.User;
import xcls.user.server.mapper.UserMapper;


/**
 * 用户相关服务.
 * @author jamine
 *
 */
@Service("userService")
public class UserService {
	@Autowired
	UserMapper userMapper;

	public User selectByPrimaryKey(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}

	public int deleteByPrimaryKey(Integer id) {
		return userMapper.deleteByPrimaryKey(id);
	}
}
