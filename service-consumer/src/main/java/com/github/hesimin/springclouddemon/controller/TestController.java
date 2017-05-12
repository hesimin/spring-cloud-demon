package com.github.hesimin.springclouddemon.controller;

import com.github.hesimin.springclouddemon.ref.ProviderRef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hesimin 2017-05-12
 */
@RestController
public class TestController {
    @Autowired
    private ProviderRef providerRef;

    @RequestMapping("/")
    public String index() {
        return "consumer from provider: "+providerRef.index();
    }
}
