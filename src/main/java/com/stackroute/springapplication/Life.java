package com.stackroute.springapplication;

import org.springframework.beans.factory.InitializingBean;

public class Life implements InitializingBean {


    public void afterPropertiesSet() throws Exception {
        System.out.println("afterproperties");
    }


}