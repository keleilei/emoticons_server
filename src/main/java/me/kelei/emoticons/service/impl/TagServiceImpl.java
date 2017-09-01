package me.kelei.emoticons.service.impl;

import me.kelei.emoticons.entity.Tag;
import me.kelei.emoticons.repository.TagRepository;
import me.kelei.emoticons.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TagServiceImpl implements TagService {

    private final TagRepository tagRepository;

    @Autowired
    public TagServiceImpl(TagRepository tagRepository) {
        this.tagRepository = tagRepository;
    }

    public String save(Tag doc) {

        tagRepository.save(doc);

        return doc.getId();
    }
}
