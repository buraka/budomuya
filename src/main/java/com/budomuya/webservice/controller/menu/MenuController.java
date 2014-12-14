package com.budomuya.webservice.controller.menu;

import com.budomuya.webservice.controller.BaseController;
import com.budomuya.webservice.mockData.MockDataManager;
import com.budomuya.webservice.model.menu.Menu;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by alparslanb
 * on 14/12/14.
 */
@RestController
public class MenuController extends BaseController {

    @RequestMapping("/getMenu")
    public List<Menu> getMenu() {

        return MockDataManager.mockMenuList();
    }
}
