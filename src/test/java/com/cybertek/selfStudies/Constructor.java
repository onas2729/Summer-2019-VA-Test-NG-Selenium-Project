package com.cybertek.selfStudies;

public class Constructor {

    public Constructor(){

        System.out.println("with int argument");
    }
    public Constructor(int a){
this();
        System.out.println("b");
    }
    public Constructor(double a){
this(10);
        System.out.println("string");
    }
    public Constructor(String a){
this (true);
        System.out.println(true
        );
    }
    public Constructor(boolean a){

    }


    public static void main(String[] args) {

        Constructor obj=new Constructor(true);
    }
}
