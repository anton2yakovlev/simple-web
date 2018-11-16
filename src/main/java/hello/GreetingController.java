package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/")
    public String greeting(Map<String, Object> model) {
        return "greeting";
    }

    @GetMapping("/login")
    public String login(Map<String, Object> model) {
        return "login";
    }

    @GetMapping("/main")
    public String main(Map<String, Object> model) {
        model.put("some", "hello");
        return "main";
    }

}