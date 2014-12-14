package com.budomuya.webservice.model.menu;

/**
 * Created by alparslanb
 * on 14/12/14.
 */
public class Menu {

    private String href;
    private String name;

    public Menu(String href, String name) {
        this.href = href;
        this.name = name;
    }

    public String getHref() {
        return href;
    }

    public String getName() {
        return name;
    }
}
