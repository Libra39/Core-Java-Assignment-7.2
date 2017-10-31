/**
 * 
 */
package Assignment_7;																								// Package declared				
import java.util.*;																									// Import all the classes in the util package.
import java.io.*;																									// Import all the classes in the io package.
/**
 * Write a program in java to sort words of given strings, then sort characters in each word
 * For example String = “ My name is XYZ” so My, name, is, XYZ is separate so first sort these and then sort the character of each word.
 * 
 * All the comments in the program will be placed on the Right-Hand-Side.
 * @author Sahil Khurana <sahilkhurana369@gmail.com>
 */
public class Assignment_7_2 {																						// Class Declared
    static String userInput ;																						// String variable userInput declared
    static int userInputLength;																						// Integer variable userInputLength declared
    public static void main(String args[]) throws IOException {														// Main method declared with IOException
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   								// BufferedReader, chained to an InputStreamReader, to read from the standard input from console.The snippet simply prints back any line which is entered.
        System.out.print("Enter a String             : ");															// Print statement
        userInput = br.readLine();																					// readline( ) reads a line up to a \r carriage return, a \n line feed, or to a \r\n combination, and then stops.
        userInputLength = userInput.length();																		// calculate the length of the input string
        System.out.print("String Sorted by Words     : ");															// Print statement
        sortWordsInStrings();																						// sortWordsInStrings() method called
        System.out.println("\nWords Sorted by Characters : ");														// Print statement
        sortCharactersOfWordsInString();																			// sortCharactersOfWordsInString() method called
     }																												// Main method closed
    
    public static void  sortWordsInStrings() {																		// sortWordsInStrings() method created
        String[] userInputArray = userInput.split("[^a-zA-Z'\\\\-]");												// splitting the string with regEx
        for (int myInteger = 0; myInteger < userInputArray.length - 1; myInteger++) {                       		// This is called a bubble sort. We go through the list of words in several passes. That is the outer loop
            for (int myNextInteger = 0; myNextInteger < userInputArray.length - myInteger - 1; myNextInteger++) {   // Here in the inner loop, we go through each word in turn
                int length1 = userInputArray[myNextInteger].length();                           					// We get the length of the current
                int length2 = userInputArray[myNextInteger + 1].length();                       					// word and the length of the next word.
                if (length1 > length2) {                                            								// If they are out of sequence, we swap them over.
                    String temp = userInputArray[myNextInteger];
                    userInputArray[myNextInteger] = userInputArray[myNextInteger + 1];
                    userInputArray[myNextInteger + 1] = temp;}
            }																										// nested for loop closed
        }																											// for loop closed
        for (String word : userInputArray) {																		// for loop to print words of the string
            System.out.print(word + ", ");}																		    // Print statement
    }																												// sortWordsInStrings() method closed
    public static void sortCharactersOfWordsInString() {															// sortCharactersOfWordsInString() method created
    	String[] userInputArray = userInput.split(" "); 															// splitting the string
        Arrays.sort(userInputArray);  																				// sorting the words
        for(String string:userInputArray) { 																		// array variable assigned to string 
            char[] word=string.toCharArray();																		// change for string to Character array
            Arrays.sort(word);                                                      								// sorting the word by Characters
            String sortedWord = new String(word);																	// new object created
            System.out.println(sortedWord); }                                       								// printing the sorted word
         }																											// sortCharactersOfWordsInString() method closed
}																													// class Assignment_7_2 closed


	