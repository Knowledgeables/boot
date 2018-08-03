package www.xiaobeifeng.top.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project :  boot.
 * Package name: www.xiaobeifeng.top.boot.controller
 * Created by :  benjamin.
 * Created time: 2018/8/2 15:10
 * Changed by :  benjamin.
 * Changed time: 2018/8/2 15:10
 * Class description:
 */
@RestController
class LoginController {
    @RequestMapping(value = "/dologin", method = RequestMethod.GET)
    public String doLogin() {

        return "hello spring boot";
    }
}
