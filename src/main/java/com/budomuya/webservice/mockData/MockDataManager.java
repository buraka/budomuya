package com.budomuya.webservice.mockData;

import com.budomuya.webservice.model.Category;
import com.budomuya.webservice.model.News;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alparslanb
 * on 11/12/14.
 */
public class MockDataManager {

    public static List<Category> mockCategoryList() {
        List<Category> categories = new ArrayList<Category>();
        categories.add(new Category(
           "spor",
           "Spor"
        ));
        categories.add(new Category(
            "magazin",
            "Magazin"
        ));

        categories.add(new Category(
            "politika",
            "Politika"
        ));

        return categories;

    }


    public static List<News> mockNewsList() {
        List<News> news = new ArrayList<News>();
        news.add(new News(
                "Radikal",
                "Fast just got faster with Nexus S.",
                "img/phones/dell-streak-7.1.jpg",
                "http://www.radikal.com.tr"
        ));
        news.add(new News(
                "Zaman",
                "Fast just got faster with Nexus S.",
                "img/phones/dell-venue.2.jpg",
                "http://www.zaman.com.tr/haber"
        ));
        news.add(new News(
                "Sabah",
                "Fast just got faster with Nexus S.",
                "img/phones/dell-venue.3.jpg",
                "http://www.sabah.com.tr"
        ));
        news.add(new News(
                "Hurriyet",
                "Fast just got faster with Nexus S.",
                "img/phones/dell-venue.4.jpg",
                "http://www.hurriyet.com.tr/anasayfa"
        ));

        return news;

    }

}