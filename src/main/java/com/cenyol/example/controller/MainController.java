package com.cenyol.example.controller;

import com.cenyol.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by sjj on 2015/10/24 0024.
 */
@Controller
public class MainController {

    // 自动装配
    @Autowired
    private UserRepository userRepository;

    // 首页
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String defaultIndex() {
        return "index";
    }

    @RequestMapping(value = "/post.html", method = RequestMethod.GET)
    public String SamolePost() {
        return "post";
    }

    @RequestMapping(value = "/about.html", method = RequestMethod.GET)
    public String about() {
        return "about";
    }

    @RequestMapping(value = "contact.html", method = RequestMethod.GET)
    public String contactMe() {
        return "contact";
    }

    @RequestMapping(value = "index.html", method = RequestMethod.GET)
    public String index() {
        return "index";
    }
}