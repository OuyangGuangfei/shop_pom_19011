package com.qf.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.entity.BackUser;
import com.qf.service.IBackUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/buser")
public class BackUserController {

    @Reference
    private IBackUserService backUserService;


    @RequestMapping("/list")
    public String userList(Model model){
        List<BackUser> backUsers = backUserService.queryAll();
        model.addAttribute("users",backUsers);
        return "buserlist";
    }


    public String userAdd(BackUser backUser){
        backUserService.insertBackUser(backUser);
        return "redirect:/buser/list";
    }

}
