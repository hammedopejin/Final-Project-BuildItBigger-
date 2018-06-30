package com.planetpeopleplatform.javajokelib;

import java.util.Random;

public class JavaJoke {

    private String[] jokes;
    private Random random;

    public JavaJoke(){
        int numberOfJokes = 3;
        jokes = new String[numberOfJokes];
        jokes[0]="Knock knock, who's there? fix the door bell, its broken." ;
        jokes[1]="What do people do before sandpaper was invented? They just ruff it.";
        jokes[2] = "This is a joke, please laugh :)";
        random = new Random();
    }

    public String tellAJoke(){
        return jokes[random.nextInt(jokes.length)];
    }
}
