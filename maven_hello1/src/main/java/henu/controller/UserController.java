package henu.controller;

import henu.pojo.User;
import henu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/add")
    public String add(@RequestParam("username") String username){
        User user = new User();
        user.setPassword("23");
        user.setUother("35");
        user.setUsername(username);
        int re = userService.add(user);
        if(re == 1) System.out.println("添加成功");
        return "tz";
    }

    @RequestMapping("/find")
    public String find(){
        User user = userService.findAll();
        System.out.println(user);
        return "add";
    }



    @RequestMapping("/test")
    public String addfs(){
        System.out.println("跳转");
        return "add";
    }

}
