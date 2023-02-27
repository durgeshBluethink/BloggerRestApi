package co.SpringDemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
     @GetMapping("/hello")
    public String home(){
        return "hi am java developer";
    }
}
