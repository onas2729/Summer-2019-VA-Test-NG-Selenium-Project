package com.cybertek.tests.d1_basic_navigation;
import com.github.javafaker.Faker;
public class FirstClass {
    public static void main(String[] args) {
        System.out.println("hello world");

        Faker faker  = new Faker();
        System.out.println(faker.name().fullName());
        System.out.println(faker.chuckNorris().fact());


    }


}
