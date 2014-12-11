package com.budomuya.webservice.controller;

import com.budomuya.webservice.mockData.MockDataManager;
import com.budomuya.webservice.model.News;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by alparslanb
 * on 11/12/14.
 */
@RestController
public class NewsController {

    @RequestMapping("/getNews")
    public List<News> getNews() {

        return MockDataManager.mockNewsList();
    }

}
