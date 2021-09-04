package com.application.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class MainController {


    @GetMapping(value = {"/index"})
    public String home() {
        return "index";
    }

    @GetMapping(value = {"/privacy"})
    public String privacy() {
        return "privacy";
    }

    @GetMapping(value = {"/project"})
    public String project() {
        return "project";
    }

    @GetMapping(value = {"/terms"})
    public String terms() {
        return "terms";
    }


}

