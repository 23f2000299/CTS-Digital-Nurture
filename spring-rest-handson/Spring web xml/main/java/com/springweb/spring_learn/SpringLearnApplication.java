package com.springweb.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLearnApplication {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(SpringLearnApplication.class);


    public static void main(String[] args) {

        displayCountry();

    }


    public static void displayCountry() {


        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");


        Country india =
                context.getBean("india", Country.class);

        Country usa =
                context.getBean("usa", Country.class);

        Country germany =
                context.getBean("germany", Country.class);

        Country japan =
                context.getBean("japan", Country.class);


        System.out.println(india);
        System.out.println(usa);
        System.out.println(germany);
        System.out.println(japan);

    }

}
