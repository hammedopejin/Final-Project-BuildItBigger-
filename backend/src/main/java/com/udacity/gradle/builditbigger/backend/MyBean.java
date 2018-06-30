package com.udacity.gradle.builditbigger.backend;

import com.planetpeopleplatform.javajokelib.JavaJoke;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private JavaJoke joker;

    public  MyBean(){
        joker = new JavaJoke();
    }
    public String getMyJoke(){
        return joker.tellAJoke();
    }
    public void setMyJoke(String joke) {
        String myJoke = joke;
    }
}