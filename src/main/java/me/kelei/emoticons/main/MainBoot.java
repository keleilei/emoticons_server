package me.kelei.emoticons.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class MainBoot {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello Boot";
    }

    public static void main(String[] args) {
        SpringApplication.run(MainBoot.class, args);
    }
}
