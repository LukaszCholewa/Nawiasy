package pl.camp.it;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string to check bracketing:");
        if ( checkBracketing(scanner.nextLine().toCharArray()) ){
            System.out.println("Bracketing is correct!");
        } else {
            System.out.println("Bracketing is NOT correct!");
        }
    }    private static boolean checkBracketing(char[] charArray){
        int bracketsCounter = 0;
        for (char sign : charArray){
            if (sign == '('){
                bracketsCounter++;
            } else if (sign == ')'){
                bracketsCounter--;
                if (bracketsCounter < 0){
                    return false;
                }
            }
        }
        if (bracketsCounter == 0){
            return true;
        }
        return false;
    }
}