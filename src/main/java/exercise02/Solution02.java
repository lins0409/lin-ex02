/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Sue Lin
 */

package exercise02;

import java.util.Scanner;

/*
* this is the pseudo code portion
* Create a program that prompts for an input string and displays output that shows the input string and the number of characters the string contains.
*   -Ask the user for an input string
*   -read the input string and store it
*   -create a variable and set to zero to store the count
*   -count the number of characters it has and store the information
*   -print out the string + how many characters it has
 */
public class Solution02 {
    public static void main (String[] args)
    {
        System.out.print("What is the input string?  ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int count = 0;

        for (int i = 0; i < string.length(); i++)
        {
            count++;
        }

        System.out.print(string + " has " + count + " characters.");
    }
}
