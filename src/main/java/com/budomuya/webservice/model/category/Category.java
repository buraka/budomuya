package com.budomuya.webservice.model.category;

import com.budomuya.webservice.model.BaseModel;

/**
 * Created by alparslanb
 * on 11/12/14.
 */
public class Category extends BaseModel {

    private String key;
    private String value;

    public Category (String key, String value) {
        super();
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
