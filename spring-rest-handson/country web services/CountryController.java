package com.springweb.spring_learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springweb.spring_learn.Country;

@RestController
public class CountryController {

    @Autowired
    private ApplicationContext context;

    @RequestMapping("/country")
    public Country getCountryIndia() {

        return context.getBean("india", Country.class);

    }

}