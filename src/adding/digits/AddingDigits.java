/*
 * Amer Stas 
 * 4/20/2020
 * This program takes a number input from the user and it finds the sum of it's digits
 */
package adding.digits;

import java.util.Scanner;

public class AddingDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Using a Scanner to get users input.
        Scanner input = new Scanner(System.in);
        // Asking the users input
        System.out.println("Please Enter number");
        // Using a variable
        int number2 = input.nextInt();
        // to make sure the number has no digits
        int number = (int) number2;
        // outputting the sum of the digits
        System.out.println("The sum of the digits is " + summ(number, 0));
        // Making sure the users input is only positive.
        if (number < 0) {
            System.out.println("Please Enter a positive number");
        }
    }

    public static int summ(int x, int y) {
        // Method to see if the input is single digit
        if (x < 9 && x >= 0) {
            y += x;
            return y;
        } else //if it's not adding the rightmost digit and repeating until there is none left.     
        {
            y += (x % 10);
            x = x / 10;
            return summ(x, y);
        }
    }
}
