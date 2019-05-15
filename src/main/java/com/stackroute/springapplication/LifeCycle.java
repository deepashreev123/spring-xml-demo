package com.stackroute.springapplication;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

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
}

    public static class PostProcessor implements BeanPostProcessor {

        public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
            System.out.println("In  postProcessBeforeInitialization of : "+beanName);
            return null;
        }

        public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
            System.out.println("In  postProcessAfterInitialization of : "+beanName);
            return null;
        }
    }
}