package com.test.herokutest.controller;

import freemarker.template.utility.StringUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping
public class IndexController {
    @GetMapping("index")
    public String getIndex(@RequestParam(required = false) String name, Model model) {
        if (StringUtils.isEmpty(name)) {
            name = "world";
        }
        name += "!!!";
        model.addAttribute("name", name);
        return "index";
    }
}
