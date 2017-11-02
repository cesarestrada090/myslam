package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/principal")
    public String mainPage() {
        return "index";
    }

    @RequestMapping("/slam")
    public String slam() {
        return "slam";
    }

    @RequestMapping("/preguntas")
    public String preguntas() {
        return "tiposDePreguntas";
    }



}
