package com.stackroute.springapplication;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;

    public class PostProcessor implements BeanPostProcessor {

        public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
            System.out.println("In  postProcessBeforeInitialization of : "+beanName);
            return null;
        }

        public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
            System.out.println("In  postProcessAfterInitialization of : "+beanName);
            return null;
        }
    }
