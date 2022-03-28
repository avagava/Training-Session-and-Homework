package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    static void task1() {
        // Task 1
        //a) Declare and initialize two variables: intVar1, intVar2 of int type
        int intVar1 = 11, intvar2 = 7;
        //b) Declare variable shortSum of short type and initalize it as the sum
        // of previously declared variables (intVar1 + intVar2)
        short shortSum = (short) (intVar1 + intvar2);
        //c) Display on screen the value stored in shortSum variable
        System.out.println(shortSum);
        //d) Display on the screen the result of the incremination shortSum++
        System.out.println(shortSum++);
        //e) Declare variable byteSum of byte type and initalize it as the sum of
        // previously declared variables (intVar1 + intVar2)
        byte byteSum = (byte) (intVar1 + intvar2);
        //f) Display on the screen the value stored in the byteSum variable
        System.out.println(byteSum);
        //g) Display on the screen the result of the incremination ++byteSum
        System.out.println(++byteSum);
    }

    static void task2() {
        //Task 2
        float x = 19.57382f;
        int w = (int) x;
        //Value rounded according to rules of math
        System.out.println(Math.round(x));
        //Value rounded according to my own method of changing decimals
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println(df.format(x));
        System.out.println(w);
        //Value rounded up
        System.out.println(Math.ceil(x));
        //Value rounded down
        System.out.println(Math.floor(x));

        //Task 2 by David
        //float number = 13.43f;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the float number to be rounded: ");

        float number = scanner.nextFloat();

        //Round down to the closes integer.
        double roundDown = Math.floor(number);
        System.out.println(roundDown);

        //Rounded according to the rules of math.
        int rounded = Math.round(number);
        System.out.println(rounded);

        //Round up to the closest integer.
        double roundUp = Math.ceil(number);
        System.out.println(roundUp);

    }

    static void task3 () {
        //Task 3
        int rightangle = 45;
        System.out.println("Sine: " + Math.sin(rightangle));
        System.out.println("Cosine: " + Math.cos(rightangle));
        System.out.println("Tangent: " + Math.tan(rightangle));
        System.out.println("Arcsine: " + Math.asin(45 * Math.PI/180));
        System.out.println("Arccosine: " + Math.acos(45 * Math.PI/180));
        System.out.println("Arctangent: " + Math.atan(45));
        System.out.println("Arctangent2: " + Math.atan2(rightangle, rightangle));
    }
    //Homework
    static void task4 () {
        System.out.println("Homework");
        System.out.println("Task 4");
        //Task 4
        int intvar3 = 88;
        int intvar4 =88;
        int result1 = ++intvar3;
        int result2 = --intvar4;
        //Incrementation
        System.out.println("Value of number: " + intvar3);
        System.out.println("After increment: " + result1);
        //Decrementation
        System.out.println("After decrement: " + result2);

        //Bitwise Complement Operator
        int y = ~88;
        System.out.println("Bitwise Complement Operator");
        System.out.println("X: " + intvar3);
        System.out.println("Y: " + y);

        //Arithmetic operator
        double a = 17.238d;
        double b = 8.331d;
        System.out.println("Arithmetic operator");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("Multiplication of a and b: " + (a * b));

        //Relational operator
        int i = 9, j = 2;
        System.out.println("Rational operator");
        System.out.println("i: " + i);
        System.out.println("j: " + j);
            // == operator
        System.out.println("== operator");
        System.out.println(i == b); //false
            // != operator
        System.out.println("!= operator");
        System.out.println(i != b); //true
        //Bitwise operator
        int t = 4, f = 43;
            //OR (|) operator
        System.out.println("OR (|) operator");
        System.out.println("Value of t = 4 and f = 43");
        System.out.println("t | f: " + (t | f));
        //I have no idea if this is what is meant by bitwise operator.
        //Conditional operator
        System.out.println("Conditional operator && (AND) and || (OR)");
        System.out.println("&&: " + ((i > j) && (j < i))); //true, both are true
        System.out.println("||: " + ((i > j) || (i < j))); //true, one is true
    }

    static void task5 () {
    //Task 5
        float distance = 2500f;
        float hours = 5f;
        float minutes = 56f;
        float seconds = 23f;
        float time_seconds = ((hours*60*60)+(minutes*60)+23);
        float time_hours = (hours+(minutes/60)+((seconds/60)/60));
        float distance_km = (distance/1000f);
        float distance_mi = (distance/1609f);
        System.out.println("Task 5");
        System.out.println("Time in seconds: " + time_seconds);
        System.out.println("Time in hours: " + time_hours);
        System.out.println("Distance in kilometers: " + distance_km);
        System.out.println("Distance in miles: " + distance_mi);
        System.out.println("Speed (m/s): " + (distance/time_seconds));
        System.out.println("Speed (km/h): "+ (distance_km/time_hours));
        System.out.println("Speed (miles/h): " + (distance_mi/time_hours));
        // Wrote the numbers in float because they show the right amount of decimal points in answers.

    }
}
