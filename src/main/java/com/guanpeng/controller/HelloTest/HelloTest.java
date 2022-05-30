package com.guanpeng.controller.HelloTest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName: HelloTest
 * @Description:
 * @Author
 * @Date 2022/5/30
 * @Version
 */
@Controller
public class HelloTest {
    @RequestMapping("/hello")
    @ResponseBody
    public String helloSpringboot() {
        return "hello springboot";
    }
}
