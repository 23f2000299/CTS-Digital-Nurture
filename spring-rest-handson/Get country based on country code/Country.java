package com.springweb.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Country {


    private static final Logger LOGGER =
            LoggerFactory.getLogger(Country.class);


    private String code;
    private String name;

    public Country() {
        System.out.println("Inside Country Constructor.");
    }

    public void setCode(String code) {
        System.out.println("Inside setCode method.");
        this.code = code;
    }

    public void setName(String name) {
        System.out.println("Inside setName method.");
        this.name = name;
    }



    @Override
    public String toString(){

        return "Country [code="
                + code
                + ", name="
                + name
                + "]";

    }
    public String getCode() {
        System.out.println("Inside getCode method.");
        return code;
    }

    public String getName() {
        System.out.println("Inside getName method.");
        return name;
    }
}
