package cst1201;

import java.util.Scanner;

/**
 * TODO: Description of your class.
 *
 * @author Niaz & Devya
 */
public class IntroducingMethods {
    
    // TODO: Fill in the body with your code
    // Given a Scanner, prompt the user for a String.  If the user enters an empty
// String, report an error message and ask for a non-empty String.  Return the
// String to the calling program.
    // TODO: Fill in the body
    // NOTE: Do not declare a Scanner in the body of this method.
    // Given a String return the number of words in the String.  A word is a sequence of 
// characters with no spaces.  Write this method so that the function call:
// 		int count = getWordCount("The quick brown fox jumped");
// results in count having a value of 5.  You will call this method from the main method.
// For this assignment you may assume that
// words will be separated by exactly one space.


    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner keyboard = new Scanner(System.in);
        getInputString(keyboard);
    }

    private static String getInputString(Scanner inScanner) {
        String input = inScanner.nextLine();
        while (input.length() == 0) {
            System.out.println("ERROR - string must not be empty.");
            System.out.println("Enter a string: ");
            input = inScanner.nextLine();
        }
        System.out.println("Which number of word you want to get: ");
        int n = inScanner.nextInt();
        getWordCount(input);
        getWord(input, n);
        return input;
    }

    private static int getWordCount(String input) {
        int wordCount = input.split(" ").length;
        System.out.println("Your string has " + wordCount + " words in it");
        return wordCount;
    }

    private static String getWord(String input, int n) {
        String arr[] = input.split(" ");
        String word = arr[n];
        System.out.println("The word you search: " + word);
        return word;
    }
}

    