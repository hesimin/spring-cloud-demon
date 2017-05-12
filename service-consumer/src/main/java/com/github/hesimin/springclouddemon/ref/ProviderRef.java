package com.github.hesimin.springclouddemon.ref;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hesimin 2017-05-12
 */
@FeignClient(name = "service-provider", fallback = ProviderRefFallback.class)
public interface ProviderRef {
    @RequestMapping("/")
    String index();
}

@Component
class ProviderRefFallback implements ProviderRef {

    @Override
    public String index() {
        return "fallback:FeignClient访问失败";
    }
}