package com.mechanitis.demo.three;

import com.mechanitis.demo.four.Person;

import java.util.logging.Logger;

public class LogPerson {
    private static final Logger LOGGER = Logger.getLogger(LogPerson.class.getName());

    public static void main(String[] args) {
        LOGGER.warning(() -> new Person("Riley").toString());
    }
}
