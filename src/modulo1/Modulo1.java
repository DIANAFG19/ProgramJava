package modulo1;

import java.util.Scanner;

/*
@author YOO
 */
public class Modulo1 {

    public static void main(String[] args) {

        //PRÁCTICA 1: HELLO WORLD!.
        System.out.println("Hello world!");

        //PRÁCICA 2: COMMENTS.
        /*
            multi line comments are placed between the slash and asterisk markers
         */
        // single line comments are placed after double forward slashes
        //PRÁCTICA 3: Strings and Printlns
        System.out.println();
        System.out.print("Hello, ");
        System.out.print("Joe");
        System.out.print("! Hello, ");
        System.out.print("Jane");
        System.out.println("!");
        System.out.println("line 1\nline 2\nline3");
        System.out.println("\"Quotes\"");
        System.out.println("Slashes \\//");
        System.out.println("How '\"confounding' \"\\\" it is!");

        //PRÁCTICA 4: METHODS
        method1();
        method2();

        //PRÁCTICA 5: CONTROL FLOW.
        System.out.println("main method starting...");
        message1();
        message2();
        System.out.println("...done with main");

        //PRÁCTICA 6: VARIABLES
        String myString = "Hello, world!";
        System.out.println(myString);
        myString = "Hello yourself!";
        System.out.println(myString);

        //PRÁCTICA 7: SCANNER
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.print("What is your name?");
        String name = input.next();
        System.out.println("Hello " + name);

        String name1 = input.next();
        int age = input.nextInt();
        double weight = input.nextDouble();
        System.out.println(name1 + " is " + age + " year old and weighs " + weight + "kg" );
    }

    //Práctica 4: Methods
    public static void method1() {
        System.out.println("run method1()");
    }

    public static void method2() {
        System.out.println("run method2()");
    }

    //Práctica 5: Control Flow
    public static void message1() {
        System.out.println("All of message1.");
    }

    public static void message2() {
        System.out.println("Start of message2.");
        message1();
        System.out.println("End of message2.");
    }

}
