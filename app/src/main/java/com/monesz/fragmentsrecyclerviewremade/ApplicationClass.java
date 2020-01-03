package com.monesz.fragmentsrecyclerviewremade;

import android.app.Application;

import java.util.ArrayList;

public class ApplicationClass extends Application
{
    public static ArrayList<Person> people;


    @Override
    public void onCreate() {
        super.onCreate();

        people = new ArrayList<Person>();
        people.add(new Person("Chuck Norris", "6546464616446"));
        people.add(new Person("John Rambo", "6546565446468"));
        people.add(new Person("Nelson Mandela", "84154545644"));

    }
}
