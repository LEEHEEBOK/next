package org.example.next.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello, controller";
    }

    @GetMapping("/background")
    public String background(Model model) {
        model.addAttribute("message", "Backgorund!~!!!!!!!!");

        return "background";
    }
}
