package controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {


    @GetMapping(value = {"/"})
    public String home() {
        return "index";
    }

    @GetMapping(value = {"/DodajUser"})
    public String dodajUser() {
        return "DodajUser";
    }

    @GetMapping(value = {"/DodajZadanie"})
    public String project() { return "DodajZadaeni"; }


}

