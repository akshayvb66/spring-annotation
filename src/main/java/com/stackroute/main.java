package com.stackroute;

import com.stackroute.Config.BeanConfig;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {

    public static void main(String[] args){

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        Movie movie1=(Movie) context.getBean("movie1");
//          System.out.println(movie1);

        Movie movie4=(Movie)context.getBean("movie1");
//        System.out.println(movie4);

        System.out.println(context.getBean("movie1"));
        System.out.println(context.getBean("movie2"));
        System.out.println(context.getBean("movie3"));

        System.out.println(movie1==movie4);
    }
}
