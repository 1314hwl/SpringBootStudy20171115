package org.HelloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @Description  
 * @author Hero
 * @date 2017年11月12日 下午9:22:52
 */
@RestController
public class HelloWorldController {
    @RequestMapping("/")
    public String sayHello() {
        return "Hello,SpringBoot!";
    }
}
