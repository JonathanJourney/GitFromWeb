package com.offcn.controller;

import com.offcn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class FirstThymeleafController {

    @GetMapping("first")
    public String indexPage(Model model){
        String message="Hello Thymeleaf";
        model.addAttribute("message",message);
        return "index";
    }

    @RequestMapping("showUser")
    public String showUser(Model model){
        User user = new User(20201001, "小白", 12);
        model.addAttribute("user",user);
        return "show";
    }

    @RequestMapping("showMap")
    public String showMap(Model model){
        Map map = new HashMap<>();
        map.put("name","小黑");
        map.put("age",18);
        map.put("id",20201919);
        model.addAttribute("map",map);
        return "showMap";
    }

    @RequestMapping("showList")
    public String showList(Model model){
            List<User> list = new ArrayList<>();
            list.add(new User(2020001,"小白0",19));
            list.add(new User(2020001,"小白1",18));
            list.add(new User(2020001,"小白2",22));
            model.addAttribute("userList",list);
            return "showList";
    }

    @RequestMapping("showString")
    public String showString(Model model){
        model.addAttribute("username","小兰");
        model.addAttribute("href","http://www.baidu.com");
        return "showString";
    }

    @RequestMapping("showIf")
    public String showIf(Model model){
        model.addAttribute("flag","yes");
        model.addAttribute("users","admin");
        model.addAttribute("manager","manager");
        return "showIf";
    }

    @RequestMapping("showHead")
    public String showHead(Model model){
        return "showHead";
    }
}
