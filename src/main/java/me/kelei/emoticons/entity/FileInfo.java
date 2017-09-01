package me.kelei.emoticons.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author chenlu@ccuu.me
 * @create 2017-09-02 00:30
 */
@Document(indexName = "emoticons", type = "e_file")
public class FileInfo {

    @Id
    private String id;

    private String userId;

    //标题
    private String title;

    //标签
    private String tags;

    //qiniu url
    private String url;

    //0 qiniu
    private String type;

    //default 0
    private String status;

    //是否删除 0 未删除 1 已删除  default 0
    private String isDeleted;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }
}
