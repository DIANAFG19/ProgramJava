package modulo2;

/*
 * @author YOO
 */
public class Exam2 {

    public static void main(String[] args) {
        
        //EJERCICIO 1:
        /*String a = "";
        a += "0";
        if (a == "0") {
            System.out.println("a is 0!");
        } else if (a == "1") {
            System.out.println("a is 1!");
        } else if (a == "a") {
            System.out.println("a is a!");
        } else {
            System.out.println("a is something else!");
        }*/

        //EJERCICIO 2:
        /*int a = 3;
        int b = -2;
        if ((a > 0) && (b > 0)) {
            if (a > b) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        } else if ((b < 0) || (a < 0)) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }*/
        
        //EJERCICIO 3:
        /*int a = 10;
        int b = 30;
        if (a * 2 < b) {
            a = a * 3;
        }
        if (b < a) {
            b++;
        } else {
            a--;
        }
        System.out.println(a + " " + b);*/
        
        //EJERCICIO 4:
        /*for (int num = 1; num < 12; num++) {
            System.out.print(num + " ");
            num += num;
        }
        for (int num = 1; num <= 10; num++) {
            System.out.print(2 * num + " ");
        }
        int num = 1;
        for (int i = 0; i < 11; i++) {
            System.out.print(num + " ");
            num += num;
        }
        for (int num = 0; num < 11; num++) {
            System.out.print(num * num + " ");
        }*/
        
        //EJERCICIO 5:
        /*int c = 5;
        for (int i = 2; i <= c; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println("Tricky!");
            }
        }*/
        
        //EJERCICIO 6:
        /*int x = 200;
        while (x >= 0) {
            System.out.print(2 * x + " ");
            x /= x;
        }*/
        //EJERCICIO 7:
        /*int x = 64;
        int y = 0;
        while (x % 2 == 0) {
            y++;
            x = x / 2;
        }
        System.out.println(x + " " + y);*/
        
        //EJERCICIO 8:
        int x;
        for (x = 0; x <= 7; x += 7) {
            System.out.println("Here");
        }
        System.out.println(x);

    }
}
