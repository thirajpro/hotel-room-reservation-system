package com.pixel.hotelroomreservationsystem.controller;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//Controller class for main content
@Controller
public class ContentController {

    @GetMapping("/home")
    public String index(){

        return "index";
    }

}
