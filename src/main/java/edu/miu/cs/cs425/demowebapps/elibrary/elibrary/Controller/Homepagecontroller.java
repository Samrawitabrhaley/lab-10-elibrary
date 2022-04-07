package edu.miu.cs.cs425.demowebapps.elibrary.elibrary.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Homepagecontroller {
    @GetMapping(value = {"/","/elibrary","/elibrary/home"})
    public String displayhomepage(){
        return "Home/index";
    }

}
