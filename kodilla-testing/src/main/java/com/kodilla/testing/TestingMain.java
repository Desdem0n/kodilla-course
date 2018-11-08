package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        System.out.println("Test - pierwszy test jednostkowy:");

        double x = 23.4;
        double y = 17.1;
        Calculator calculator = new Calculator();
        double sumXY = calculator.addAToB(x, y);
        double subsXY = calculator.substractAFromB(x, y);
        System.out.println("Sum of numbers: " + x + " i " + y + " equals " + sumXY);
        System.out.println("difference of numbers: " + x + " i " + y + " equals " + subsXY);
    }
}
