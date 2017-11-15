package com.stackroute.assessmentengine.authenticationservice.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.stackroute.assessmentengine.authenticationservice.domain.Shop;


@Controller
public class HomeController {
 
    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }
    
//    @RequestMapping(value = "/hello")
//    public String hello() {
//        return "helloworld";
//    }
    
    @RequestMapping(value="{name}", method = RequestMethod.GET)
	public @ResponseBody com.stackroute.assessmentengine.authenticationservice.domain.Shop getShopInJSON(@PathVariable String name) {

		Shop shop = new Shop();
		shop.setName(name);
		shop.setStaffName(new String[]{"mkyong1", "mkyong2"});

		return shop;

	}

}
