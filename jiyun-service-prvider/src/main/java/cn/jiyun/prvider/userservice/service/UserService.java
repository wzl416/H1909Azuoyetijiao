package cn.jiyun.prvider.userservice.service;

import cn.jiyun.prvider.userservice.mapper.UserMapper;
import cn.jiyun.prvider.userservice.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryByid(Integer id){
    return this.userMapper.selectByPrimaryKey(id);
    }

}
