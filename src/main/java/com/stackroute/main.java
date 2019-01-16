package com.stackroute;

import com.stackroute.Config.BeanConfig;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {

    public static void main(String[] args){

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        Movie movie1=context.getBean(Movie.class);
          System.out.println(movie1);

    }
}
