package org.launchcode.java.demos.lsn1datatypes;

public class HelloMethods {

    public static void main(String[] args) {
        String [] [] names = {
                {"wimwega", "Habari "},
                {"Nympha", "Patrick"},
        };
        //Wimwega Nympha
        System.out.println(names[0][0] + names[1][0]);
        // Habari Patrick
        System.out.println(names[0][1] + names[1][1]);


    }
}
