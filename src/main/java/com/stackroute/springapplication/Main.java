package com.stackroute.springapplication;

import com.stackroute.springapplication.beans.Actor;
import com.stackroute.springapplication.beans.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

//        Resource resource = new ClassPathResource("beans.xml");
//        BeanFactory beanFactory = new XmlBeanFactory(resource);

        //Lazy instantiation
//
//        Movie movie = (Movie) beanFactory.getBean("movie1");
//        System.out.println(movie.welcomeMsg());


//        BeanDefinitionRegistry beanDefinitionRegistry = new DefaultListableBeanFactory();
//        BeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
//        beanDefinitionReader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
//        Movie movie=(Movie) ((DefaultListableBeanFactory) beanDefinitionRegistry).getBean("movie1");

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie = (Movie) context.getBean("movie");

        Movie movie1 = (Movie) context.getBean("movie1");

        System.out.println(movie == movie1); // singleton scope (default) returns true, 'prototype' returns false


        System.out.println(movie.welcomeMsg() + "\nMovie name : " + movie.getMovieName() + "\nActor Name : " + movie.getActorNAme() + "\nGenre : " + movie.getGenre());

        System.out.println(movie1.welcomeMsg() + "\nMovie name : " + movie1.getMovieName() + "\nActor Name : " + movie1.getActorNAme() + "\nGenre : " + movie1.getGenre());

        Actor actor = (Actor) context.getBean("actor");


        //System.out.println(movie == movie1); // singleton scope (default) returns true, 'prototype' returns false


        System.out.println(actor.welcomeMsg() + "\nActor name : " + actor.getActorName() + "\nGender : " + actor.getGender() + "\nAge : " + actor.getAge());

    }
}

