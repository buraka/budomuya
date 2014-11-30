package com.budomuya.webservice.model;

/**
 * Created by alparslanb
 * on 27/11/14.
 */
public class Hello {

    private long id;
    private String content;

    public Hello(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}