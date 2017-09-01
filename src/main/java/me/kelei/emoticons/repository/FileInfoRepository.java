package me.kelei.emoticons.repository;

import me.kelei.emoticons.entity.FileInfo;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileInfoRepository extends PagingAndSortingRepository<FileInfo, String> {

}
