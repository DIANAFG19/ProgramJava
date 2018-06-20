package modulo3;

/*
 * @author YOO
 */
public class Exam3 {
    public static void main(String[] args) {
        //EJERCICIO 1.
        String foo = "peanuts";
        String bar = "foo";
        mystery(bar, foo, "John");
        
        //EJERCICIO 2.
        int x = 3;
        doubleMe(x);
        System.out.println("x doubled is " + x);
        
        //EJERCICIO 3.
        int resultado = smallest(1, 2, 3);
        System.out.println("Resultado: " + resultado);
        
        //EJERCICIO 4.
        int digito = lastDigit(-123);
        System.out.println("Digito es: " + digito);
        
        //EJERCICIO 5.
        System.out.println("Muestra: " + makeFancy("JAVA"));
        
        //EJERCICIO 6.
        /*int numero = mystery(1);
        System.out.println("Ahora el 6 muestra: " + numero);*/
        
        //EJERCICIO 7.
        /*int siete = puzzle(22, 11);
        System.out.println("El siete muestra: " + siete);*/
        
        //EJERCICIO 8.
        int ocho = someCode(10, 2, 3);
        System.out.println("Ocho es: " + ocho);
    }
    //EJERCICIO 1.
    public static void mystery(String foo, String bar, String zazz) {
        System.out.println(zazz + " and " + foo + " like " + bar);
    }
    
    //EJERCICIO 2.
    public static void doubleMe(int x) {
        x = x * 2;
    }
    
    //EJERCICIO 3.
    public static int smallest(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }
     
    //EJERCICIO 4.
    public static int lastDigit(int num) {
        return Math.abs(num % 10);
    }
    
    //EJERCICIO 5.
    public static String makeFancy(String s) {
        if (s.length() == 0) {
            return "*";
        }
        return "*" + s.substring(0,1) + makeFancy(s.substring(0, s.length()-1));
    }
    
    //EJERCICIO 6.
    /*public static int mystery (int x) {
        if (x == 5){
            return x;
        } else {
            return mystery(x--) * 5;
        }   
    }*/
    
    //EJERCICIO 7.
    /*public static int puzzle(int i, int j) {
        if (i == j) {
            return 0;
        } else {
            return 1 + puzzle(i – 2, j – 1);
        }
    }*/
    
    //EJERCICIO 8.
    public static int someCode(int a, int b, int c){
        if((a<b) && (b<c)) {
            return a;
        }
        if((a>=b) && (b>=c)) {
            return b;
        }
        if((a==b) || (a==c) || (b==c)) {
        return c;
        }
        return 0;
    }
}
