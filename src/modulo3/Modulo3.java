package modulo3;
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
    }
    //PRÁCTICA 3.
    public static void sentence(String she, String who, String whom) {
        System.out.println(who + " and " + whom + " like " + she);
    }
    
    //PRÁCTICA 4.
    public static void power(int base, int exp) {
    int result = 1;
    for (int i = 1; i <= exp; i++) {
        result *= base;
    }
    System.out.println("base to the " + exp + " = " + result);
}
}
