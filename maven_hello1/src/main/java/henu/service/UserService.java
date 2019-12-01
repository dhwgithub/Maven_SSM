package henu.service;

import henu.dao.UserMapper;
import henu.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {

    @Autowired
    UserMapper userMapper;

    public int add(User user){
        return userMapper.insert(user);
    }

    public User findAll(){
        return userMapper.selectByPrimaryKey(1);
    }
}
