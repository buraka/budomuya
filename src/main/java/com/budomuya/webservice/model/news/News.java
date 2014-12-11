package com.budomuya.webservice.model.news;

import com.budomuya.webservice.model.BaseModel;

/**
 * Created by alparslanb
 * on 11/12/14.
 */
public class News extends BaseModel {

    private String name;
    private String snippet;
    private String image;
    private String imageUrl;

    public News(String name, String snippet,
                String image, String imageUrl) {

        super();
        this.name = name;
        this.snippet = snippet;
        this.image = image;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSnippet() {
        return snippet;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
