package www.xiaobeifeng.top.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import www.xiaobeifeng.top.boot.entity.Users;
import www.xiaobeifeng.top.boot.repositotory.UserRepository;

/**
 * Project :  boot.
 * Package name: www.xiaobeifeng.top.boot.controller
 * Created by :  benjamin.
 * Created time: 2018/8/3 15:38
 * Changed by :  benjamin.
 * Changed time: 2018/8/3 15:38
 * Class description:
 */

@RestController
@RequestMapping("User")
class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/getUserList")
    public List<Users> userList() {
        return userRepository.findAll();
    }


}
