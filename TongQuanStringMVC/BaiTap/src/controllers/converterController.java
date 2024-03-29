package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class converterController {
    @GetMapping("/converter")
    public String converter()
    {
        return "index";
    }

    @PostMapping(value = "/result")
    public String result(@RequestParam double usd, double rate, Model model) {
        model.addAttribute("usd", usd);
        model.addAttribute("rate", rate);
        model.addAttribute("vnd", usd * rate);
        return "index1";
    }


}