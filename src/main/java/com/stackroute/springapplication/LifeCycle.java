package com.stackroute.springapplication;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycle implements InitializingBean, DisposableBean {
    public void customInit(){
        System.out.println("in custom init");
    }
    public void destroy() throws Exception {
        System.out.println("destroy");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("after propertiesset");
    }


    public void customDestroy(){
        System.out.println("in custom destroy");
}}