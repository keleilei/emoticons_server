package me.kelei.emoticons.controller;

import me.kelei.emoticons.util.GenerateTokenUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/token")
public class TokenController {

    @GetMapping
    public String getToken(){
        return GenerateTokenUtil.getToken();
    }
}
