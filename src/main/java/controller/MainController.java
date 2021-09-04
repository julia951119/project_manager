package controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MainController {


    @GetMapping(value = {"/"})
    public String home() {
        return "index";
    }

    @GetMapping(value = {"/privacy"})
    @ResponseBody
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

