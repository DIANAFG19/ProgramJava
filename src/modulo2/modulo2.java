package modulo2;

import java.util.Scanner;

/*
 * @author YOO
 */
public class modulo2 {

    public static void main(String[] args) {

        //BOOLEANS AND IF / ELSE IF / ELSE STATEMENTS
        int a = 2;
        int b = 1;
        if (a == b) {
            System.out.println("Los números son iguales");
        } else if (a < b) {
            System.out.println("El número " + a + " es menor a " + b);
        } else if (b > a) {
            System.out.println("El número " + a + " es mayor a " + b);
        } else {
            System.out.println("Los números son diferentes.");
        }

        //COMBINING LOGIC
        boolean x = true;
        boolean y = false;
        if (x && y) {
            System.out.println("a");
        } else if (x || y) {
            System.out.println("b");
        } else if (!x) {
            System.out.println("c");
        } else {
            System.out.println("d");
        }

        //LOOPS
        Scanner input = new Scanner(System.in);
        String playAgain = "yes";
        /*while (playAgain.equals("yes")) {
            playAgain = input.next();
        }*/
        for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
        }
        for (int i = 1; i <= 4; i++) {
            System.out.println("+---+---+---+");
            if (i < 4) {
                System.out.println("|---|---|---|");
            }
        }

        //NESTED LOOPS
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print("0 ");
            }
            System.out.println();
        }

        //WHILE LOOPS
        System.out.print("Enter yes or no: ");
        String answer = input.next();
        while (!answer.equals("yes") && !answer.equals("no")) {
            System.out.println("Enter ONLY yes or no, please: ");
            answer = input.next();
        }
        System.out.println("Thank you!");
    }
}
