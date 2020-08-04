package cn.jiyun.prvider.userservice.controller;

import cn.jiyun.prvider.userservice.pojo.User;
import cn.jiyun.prvider.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

@Autowired
    private UserService userService;



@GetMapping("{id}")
    public User queryByid(@PathVariable("id")Integer id){
    return this.userService.queryByid(id);
}


}
