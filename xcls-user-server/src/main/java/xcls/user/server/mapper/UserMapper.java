package xcls.user.server.mapper;

import org.springframework.stereotype.Repository;

import xcls.user.server.domain.User;
@Repository
public interface UserMapper {

	int deleteByPrimaryKey(Integer id);

	int insert(User record);

	int insertSelective(User record);

	User selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);


}