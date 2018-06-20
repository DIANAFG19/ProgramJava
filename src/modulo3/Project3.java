package modulo3;

/*
 * @author YOO
 */
import java.util.Scanner;

public class Project3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sentence you want encrypt: ");
        String str = input.nextLine();
        String result = encryptString(str);
        System.out.println(result);
    }

    public static String normalizeText(String str) {
        str = str.replaceAll("[^A-Za-z]+", "").toUpperCase();
        System.out.println(str);
        return str;
    }

    public static String caesarify(String str, int shift) {
        String order = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String neworder = shiftAlphabet(shift);
        String new1 = "";
        for (int i = 0; i < str.length(); i++) {
            new1 = new1 + neworder.charAt(order.indexOf(str.charAt(i)));
        }
        return new1;
    }

    public static String groupify(String str, int n) {
        if (str.length() % n != 0) {
            for (int i = 0; i < str.length() % n; i++) {
                str = str + "x";
            }
        }
        String sub = "";
        int times = str.length() / n;
        for (int i = 0; i < times; i++) {
            sub = sub + str.substring(i * n, i * n + n) + " ";
        }
        return sub;
    }

    public static String encryptString(String str) {
        str = normalizeText(str);
        Scanner input = new Scanner(System.in);
        System.out.print("How much you want to shift? ");
        int shift = input.nextInt();
        str = caesarify(str, shift);
        System.out.print("How many letters in one part? ");
        int n = input.nextInt();
        str = groupify(str, n);
        return str;
    }

    public static String shiftAlphabet(int shift) {
        int start = 0;
        if (shift < 0) {
            start = (int) 'Z' + shift + 1;
        } else {
            start = 'A' + shift;
        }
        String result = "";
        char currChar = (char) start;
        for (; currChar <= 'Z'; ++currChar) {
            result = result + currChar;
        }
        if (result.length() < 26) {
            for (currChar = 'A'; result.length() < 26; ++currChar) {
                result = result + currChar;
            }
        }
        return result;
    }
}
