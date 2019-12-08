package com.cybertek.tests.d14_properties_driver_class_test_base_class;

public class Singleton {
    // singleton class will have private constructor
    // it means other classes can not create object of this class
    private Singleton() {
    }

    static String str;

    public static String getInstance() {
        // if str has not value, initialize it and return
        if (str == null) {
            System.out.println("str is null. assigning value it");
            str = "ice cream was food";
        }
        // else just return it
        else {
            System.out.println("it already has a value");
        }
        return str;
    }
}
