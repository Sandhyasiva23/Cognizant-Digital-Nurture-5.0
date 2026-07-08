package com.cognizant.springlearn;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.spring_learn.Country;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


@SpringBootApplication
public class SpringLearnApplication {


    private static final Logger LOGGER =
            LoggerFactory.getLogger(SpringLearnApplication.class);


    public static void main(String[] args) {


        SpringApplication.run(SpringLearnApplication.class, args);


        LOGGER.info("START");


        displayDate();

        displayCountry();

        displayCountries();


        LOGGER.info("END");


    }



    // HANDS ON 2

    public static void displayDate(){

        LOGGER.info("START displayDate");


        ApplicationContext context =
                new ClassPathXmlApplicationContext("date-format.xml");


        SimpleDateFormat format =
                context.getBean("dateFormat", SimpleDateFormat.class);


        try {

            Date date = format.parse("31/12/2018");

            LOGGER.debug("Date : {}",date);

        }

        catch(Exception e){

            LOGGER.error("Error parsing date",e);

        }


        LOGGER.info("END displayDate");

    }



    // HANDS ON 4 and 5


    public static void displayCountry(){


        LOGGER.info("START displayCountry");


        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");


        Country country =
                context.getBean("country",Country.class);



        LOGGER.debug("Country : {}",country);



        Country anotherCountry =
                context.getBean("country",Country.class);



        LOGGER.debug("Another Country : {}",anotherCountry);



        LOGGER.info("END displayCountry");

    }




    // HANDS ON 6


    public static void displayCountries(){


        LOGGER.info("START displayCountries");


        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");



        ArrayList<Country> countries =
                context.getBean("countryList",ArrayList.class);



        LOGGER.debug("Countries : {}",countries);



        LOGGER.info("END displayCountries");

    }


}