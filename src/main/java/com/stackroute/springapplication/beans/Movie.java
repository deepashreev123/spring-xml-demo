package com.stackroute.springapplication.beans;

public class Movie {
    Actor actor = new Actor();

    public Movie(Actor actor) {
        this.actor = actor;
    }

    public Movie() {
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
}




