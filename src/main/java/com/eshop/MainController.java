package com.eshop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

/**
 * Created by ONazarenko on 16/07/19.
 */
@Controller
public class MainController {

    @RequestMapping("/")
    public String main(){
        return "main";
    }
}
