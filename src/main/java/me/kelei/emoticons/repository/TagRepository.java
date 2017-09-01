package me.kelei.emoticons.repository;

import me.kelei.emoticons.entity.Tag;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends PagingAndSortingRepository<Tag, String> {

}
