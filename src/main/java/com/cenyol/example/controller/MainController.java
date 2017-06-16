package com.cenyol.example.controller;

import com.cenyol.example.model.TblAboutEntity;
import com.cenyol.example.repository.AboutRepository;
import com.cenyol.example.repository.UserRepository;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

/**
 * Created by sjj on 2015/10/24 0024.
 */
@Controller
public class MainController {

    // 自动装配
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AboutRepository aboutRepository;

    // 首页
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String defaultIndex() {
        List<TblAboutEntity> list=aboutRepository.findAll();
        System.out.print("list------"+list.size());
        return "index";
    }

    @RequestMapping(value = "/post.html", method = RequestMethod.GET)
    public String SamolePost() {
        return "post";
    }

    @RequestMapping(value = "/about.html", method = RequestMethod.GET)
    public Map<String,Object> about() {
        Map<String,Object> map=new HashedMap();
        map.put("username","jreey");
        map.put("password","123456");
        List<TblAboutEntity> list=aboutRepository.findAll();
        System.out.print("list------"+list.size());
        return map;
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