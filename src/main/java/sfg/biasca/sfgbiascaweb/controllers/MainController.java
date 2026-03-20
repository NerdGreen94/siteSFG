package sfg.biasca.sfgbiascaweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home() {
        return "index";
    }
    @GetMapping("/settori")
    public String settori() {
        return "settori";
    }
}
