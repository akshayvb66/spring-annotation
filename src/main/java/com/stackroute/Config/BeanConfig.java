package com.stackroute.Config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {

    @Bean("actor")
    public Actor actor1() {
        Actor actor = new Actor("Yash", "male", 35);
        return actor;
    }

    @Bean("movie1")
    @Scope(value="prototype")
    public Movie movie1() {
        return new Movie(actor1());
    }

    @Bean("actor2")
    public Actor actor2() {
        Actor actor = new Actor("DiCaprio", "male", 43);
        return actor;
    }

    @Bean("actor3")
    @Scope(value="prototype")
    public Actor actor3() {
        Actor actor = new Actor("Paul Rudd", "male", 48);
        return actor;
    }


    @Bean(name = "movie2")
    public Movie movie2() {
        return new Movie(actor2());
    }

    @Bean("movie3")
    public Movie movie3() {
        return new Movie(actor3());
    }

}


