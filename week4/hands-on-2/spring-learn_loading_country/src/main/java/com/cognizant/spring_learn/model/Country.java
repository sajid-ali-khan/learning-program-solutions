package com.cognizant.spring_learn.model;

import com.cognizant.spring_learn.SpringLearnApplication;

public class Country {
    private String code;
    private String name;

    public Country() {
        var logger = SpringLearnApplication.LOGGER;
        logger.info("Inside Country Constructor...");
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
