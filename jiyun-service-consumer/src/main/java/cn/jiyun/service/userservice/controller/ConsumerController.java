package cn.jiyun.service.userservice.controller;

import cn.jiyun.service.userservice.pojo.User;
import cn.jiyun.service.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("consumer")
public class ConsumerController {
@Autowired
private UserService userService;
    @GetMapping
public List<User> findAll(@RequestParam("ids")List<Integer> ids){
    return this.userService.queryByid(ids);
}

}
