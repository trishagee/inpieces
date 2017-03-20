package com.mechanitis.demo.two;

import java.util.logging.Logger;

public class LogSomething {
    private static final Logger LOGGER = Logger.getLogger(LogSomething.class.getName());

    public static void main(String[] args) {
        LOGGER.warning("Something happened!");
    }
}
