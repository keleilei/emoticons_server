package me.kelei.emoticons.controller;

import me.kelei.emoticons.entity.Tag;
import me.kelei.emoticons.entity.User;
import me.kelei.emoticons.service.TagService;
import me.kelei.emoticons.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tag")
public class TagController {

    private TagService tagService;


    @Autowired
    public TagController(TagService tagService){
        this.tagService = tagService;
    }

    @PostMapping
    public String save(@ModelAttribute Tag tag) {
        return tagService.save(tag);
    }

    @GetMapping("/{tagId}")
    public User get(@PathVariable String tagId){
        return null;
    }

}
