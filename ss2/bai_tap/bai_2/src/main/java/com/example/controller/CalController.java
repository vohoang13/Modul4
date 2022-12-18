package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("calculate")
public class CalController {
    @GetMapping("")
    public String calculate(){
        return "calculator";
    }

    @PostMapping("/operate")
    public String getCal(@RequestParam String operate, @RequestParam Float num1, @RequestParam Float num2, Model model){
        float result = 0;
        switch (operate){
            case "Addition(+)":
                result = num1 + num2;
                break;
            case "Subtraction(-)":
                result = num1 - num2;
                break;
            case "Multiplication(*)":
                result = num1 * num2;
                break;
            case "Division(/)":
                result = num1 / num2;
                break;
        }
        model.addAttribute("result",result);
        return "calculator";
    }
}
