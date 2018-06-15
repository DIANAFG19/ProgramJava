package modulo1;
import java.util.Scanner;
/*
 * @author YOO
 */
public class Project1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name? ");
        String nombre = entrada.next();
        System.out.print("Nice to meet you " + nombre + ", Where are you travelling to? ");
        String viaje = entrada.next();
        System.out.println("Great! " + viaje + " sounds like a great trip \n ****************************");

        System.out.println("10 plus 20 is " + 10 + 20);

        System.out.print("Hello ");
        System.out.println("World ");
        System.out.print("Java is fun!");

        String myStringVar = "Good Morning";
        String mySecondVar = "I love CS";
        myStringVar = mySecondVar;
        System.out.println(myStringVar);
    }
}
