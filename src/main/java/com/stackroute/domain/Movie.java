package com.stackroute.domain;

import org.springframework.stereotype.Component;

@Component
public class Movie {

    private Actor Actor;

public Movie (com.stackroute.domain.Actor actor){Actor= actor;}


    @Override
    public String toString() {
        return "Movie{ "  + Actor +
                '}';
    }

}

