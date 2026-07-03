package com.springweb.spring_learn.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.springweb.spring_learn.Country;

@Service
public class CountryService {

    @Autowired
    private ApplicationContext context;

    public Country getCountry(String code) {

        List<Country> countries =
                (List<Country>) context.getBean("countryList");

        for (Country country : countries) {

            if (country.getCode().equalsIgnoreCase(code)) {

                return country;

            }

        }

        return null;
    }

}
