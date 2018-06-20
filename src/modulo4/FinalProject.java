package modulo4;

/*
 * @author YOO
 */
import java.util.Scanner;

public class FinalProject {

    static Scanner input = new Scanner(System.in);
    static Maze myMap = new Maze();

    public static void main(String[] args) {
        intro();
        int moves = 0; //count the number of user moves
        while (!myMap.didIWin()) {
            userMove();
            moves++;
            movesMessage(moves);
            if (moves == 100) {
                System.out.println("Sorry, but you didn't escape in time- you lose!");
                System.exit(0);
            }
        }
        System.out.print("Congratulations, you made it out alive!.");
        System.out.println("and you did it in " + moves + " moves");
    }

    public static void intro() {
        System.out.println("Welcome to the Maze Runner");
        System.out.println("Here is your current position");
        myMap.printMap();
    }

    public static void userMove() {
        System.out.print("Where would you like to move? (R, L, U, D) ");
        char direction = (input.next()).charAt(0);
        direction = Character.toUpperCase(direction);
        //repeatedly reprompt the user until they enter a desired direction
        boolean isValidInput = false;
        while (!isValidInput) {
            if (direction == 'R' || direction == 'L'
                    || direction == 'U' || direction == 'D') {
                isValidInput = true;

                if (navigatePit(direction + "")) {
                    myMap.jumpOverPit(direction + "");
                }
                availableWay(direction);
                break;
            } else {
                System.out.println("Error, please enter a letter R, L, U or D");
                System.out.print("Where would you like to move? (R, L, U, D) ");
                direction = (input.next()).charAt(0);
                direction = Character.toUpperCase(direction);
            }
        }
    }

    public static void availableWay(char direction) {
        if (direction == 'R' && myMap.canIMoveRight()) {
            myMap.moveRight();
            myMap.printMap();
        } else if (direction == 'L' && myMap.canIMoveLeft()) {
            myMap.moveLeft();
            myMap.printMap();
        } else if (direction == 'U' && myMap.canIMoveUp()) {
            myMap.moveUp();
            myMap.printMap();
        } else if (direction == 'D' && myMap.canIMoveDown()) {
            myMap.moveDown();
            myMap.printMap();
        } else {
            System.out.println("Sorry, you’ve hit a wall.");
        }
    }

    private static void movesMessage(int moves) {
        if (moves == 50) {
            System.out.println("Warning: You have made " + moves + " moves, you have "
                    + "50 remaining before the maze exit closes");
        } else if (moves == 75) {
            System.out.println("Alert: You have made " + moves + " moves, you only have "
                    + "25 moves left to escape.");
        } else if (moves == 90) {
            System.out.println("Danger: You have made " + moves + " moves, you only have "
                    + "10 moves left to escape.!!");
        } else if (moves == 100) {
            System.out.println("Oh no! You took too long to escape, and "
                    + "now the maze exit is closed FOREVER >:[");
        }
    }

    private static boolean navigatePit(String direction) {
        if (myMap.isThereAPit(direction)) {
            System.out.println("Watch out! There's a pit ahead, jump it?");
            String choice = input.next();
            if (choice.charAt(0) == 'y') {
                return true;
            } else {
                System.out.println("Sorry, You fell into the bit. You lose the game.");
                System.exit(0);
            }
        }
        return false;
    }
}
