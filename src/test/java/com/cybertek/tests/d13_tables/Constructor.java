package com.cybertek.tests.d13_tables;


public class Constructor {
    public  static String name;
    public Constructor (){
        name="aysel";
    }
    {name= "muaz";}
    static  {
        name="hakan";
    }

    public static void main(String[] args) {
        System.out.println(name);
    }

}
