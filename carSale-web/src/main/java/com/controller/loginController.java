package com.controller;


import com.entity.Company;
import com.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/login")
public class loginController {

    @Autowired
    private CompanyService companyService;

    @RequestMapping("/name")
    @ResponseBody
    public String findName(String name){


       return name;
    }


}
