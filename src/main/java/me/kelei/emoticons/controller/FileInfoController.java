package me.kelei.emoticons.controller;

import me.kelei.emoticons.entity.FileInfo;
import me.kelei.emoticons.service.FileInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/file")
public class FileInfoController {

    private FileInfoService fileInfoService;


    @Autowired
    public FileInfoController(FileInfoService fileInfoService){
        this.fileInfoService = fileInfoService;
    }

    @PostMapping
    public String save(@ModelAttribute FileInfo file) {
        return fileInfoService.save(file);
    }

    @GetMapping("/{fileId}")
    public FileInfo get(@PathVariable String fileId){

        return null;
    }

}
