package modulo3;

import java.util.Scanner;

/*
 * @author YOO
 */
public class Modulo3 {
    public static void main(String[] args) {
        //PRÁCTICA 1: MEET PARAMETERS
        String whom = "her";
        String who = "him";
        String it = "who";
        String he = "it";
        String she = "whom";
        sentence(he, she, it);
        sentence(she, he, who);
        sentence(it, "stu", "boo");
        sentence(it, whom, who);
        
        //PRÁCTICA 2: OVERLOADING
        power(2, 2);
        
        //PRÁCTICA 3: MEET RETURNS
        int x = 5;
        x = change(x);
        System.out.println(x);
        
        //PRÁCTICA 4: JAVA'S MATH CLASS
        int a = 5;
        int b = 10;
        double aSq = Math.pow(a, 2);
        double bSq = Math.pow(b, 2);
        double c = Math.sqrt(aSq + bSq);
        System.out.println(c);
        
        //PRÁCTICA 5; JAVA'S STRING METHODS
        String s = "hello world";
        System.out.println(s.length());
        String sa = "hello world";
        char result = sa.charAt(5);
        System.out.println(result);
        
        //PRÁCIICA 6: RECURSIVE ALHORITHMS
        Scanner entrada1 = new Scanner(System.in);
        int numero = entrada1.nextInt();
        System.out.println("Resultado = " + factorial(numero));
        
        //PRÁCTICA 7: RECURSIVE TRACING
        Scanner entrada2 = new Scanner(System.in);
        int numero2 = entrada2.nextInt();
        System.out.println("Resultado = " + fibonacci(numero2));
        
        print(4);
    }
    //PRÁCTICA 1.
    public static void sentence(String she, String who, String whom) {
        System.out.println(who + " and " + whom + " like " + she);
    }
    
    //PRÁCTICA 2.
    public static void power(int base, int exp) {
    int result = 1;
    for (int i = 1; i <= exp; i++) {
        result *= base;
    }
    System.out.println("base to the " + exp + " = " + result);
    }
    
    //PRÁCTICA 3.
    public static int change(int x) {
        x*=10;
        return x;
    }
    
    //PRÁCTICA 6.
    public static int factorial(int numero){
        if(numero == 1){
            return 1;
        }
        return numero * factorial(numero - 1);
         
    }
    //PRÁCTICA 7.
    public static int fibonacci(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    
    public static void print(int n) {
        if (n == 1) {
            System.out.print("< bc >");
        } else {
            System.out.print("p(" + n + ") -> ");
            print(n-1);
        }
    }
}
