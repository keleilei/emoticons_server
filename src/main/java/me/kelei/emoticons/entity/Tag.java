package me.kelei.emoticons.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author chenlu@ccuu.me
 * @create 2017-09-02 00:50
 */

@Document(indexName = "emoticons", type = "e_tag")
public class Tag {

    @Id
    private String id;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
