package edu.wctc.pizzatutorial;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PizzaController {
    @GetMapping("/Step1")
    public  String page1() {
        return "Step1.html";
    }
    @GetMapping("/Step2")
    public  String page2() {
        return "Step2.html";
    }
    @GetMapping("/Step3")
    public  String page3() {
        return "Step3.html";
    }
}
