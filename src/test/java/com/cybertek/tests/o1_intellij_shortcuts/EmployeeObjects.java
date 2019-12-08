package com.cybertek.tests.o1_intellij_shortcuts;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee obj1 = new Employee("Rahwa", "007", 20, 123456, "CEO", 20000);
        obj1.getInfo();
        System.out.println("-------------------------------------------------------");

        Employee obj2 = new Employee("Madina", "607487", 20, 456321, "SDET", 85000);
        obj2.getInfo();

        Employee obj3 = new Employee("Madina", "607487", 20, 456321, "SDET", 85000);
        obj2.getInfo();



        String[] str = {"Osman"};

        for (int i = 0; i <str.length ; i++) {
            System.out.println(str); // hash code
            System.out.println(str[i]); // hash code


        }

    }
}
