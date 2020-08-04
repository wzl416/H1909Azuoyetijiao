package cn.jiyun.service.userservice.dao;

import cn.jiyun.service.userservice.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class UserDao {
    @Autowired
    private RestTemplate restTemplate;

   /* private DiscoveryClient discoveryClient;*/

    public User queryUserByid(Integer id){
        String uri="http://localhost:8081/user/"+id;
    return this.restTemplate.getForObject(uri,User.class);

    }

}
