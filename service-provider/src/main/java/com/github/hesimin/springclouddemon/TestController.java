package com.github.hesimin.springclouddemon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hesimin 2017-05-12
 */
@RestController
public class TestController {
    @RequestMapping("/")
    public String index(){
        return "this is service-provider";
    }
}
