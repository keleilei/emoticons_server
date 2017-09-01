package me.kelei.emoticons.service.impl;

import me.kelei.emoticons.entity.FileInfo;
import me.kelei.emoticons.repository.FileInfoRepository;
import me.kelei.emoticons.service.FileInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FileInfoServiceImpl implements FileInfoService {

    private final FileInfoRepository fileInfoRepository;

    @Autowired
    public FileInfoServiceImpl(FileInfoRepository fileInfoRepository) {
        this.fileInfoRepository = fileInfoRepository;
    }

    public String save(FileInfo doc) {

        fileInfoRepository.save(doc);

        return doc.getId();
    }
}
