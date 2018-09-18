package com.careertimeline.adit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfileHomeController {

    @GetMapping("/profileHome")
    public String greeting() {
        return "ProfileHome";
    }
}
