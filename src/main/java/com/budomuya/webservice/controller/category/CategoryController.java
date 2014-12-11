package com.budomuya.webservice.controller.category;

import com.budomuya.webservice.controller.BaseController;
import com.budomuya.webservice.mockData.MockDataManager;
import com.budomuya.webservice.model.category.Category;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by alparslanb
 * on 11/12/14.
 */
@RestController
public class CategoryController extends BaseController {

    @RequestMapping("/getCategories")
    public List<Category> getCategories() {

        return MockDataManager.mockCategoryList();
    }

}
