package cn.jiyun.service.userservice.service;

import cn.jiyun.service.userservice.dao.UserDao;
import cn.jiyun.service.userservice.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> queryByid(List<Integer> ids){
        List<User> users=new ArrayList<>();
        ids.forEach(id->{
            users.add(this.userDao.queryUserByid(id));
        });
                return users;

    }

}
