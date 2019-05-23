package life.majiang.community;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 */
@Controller
public class HelloController {

    @GetMapping("/Hello")
    public String Hello(@RequestParam(name = "name",required = false,defaultValue = "ll")String name, Model model){
        model.addAttribute("name",name);
        return "Hello";
    }

}
