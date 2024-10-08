import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

// used the command "javadoc OrganizedStack.java" to generate the javadocs
// used the command "java OrganizedStack" to run the program

/**
 * This class reads integers from user input, sorts them, and stores them in a stack.
 * It demonstrates a maintenance task where the logic was adapted from using a LinkedList to a Stack.
 */
public class OrganizedStack {

    /**
     * The main points of the java program are as follows:
     *
     * This method will follow these steps:
     * 1. Displays a message asking the user to enter a list of integers, 
     * separated by spaces, and instructs them to type "finish" to end the input.
     * 2. Reads the integers entered by the user, handling potential errors such as invalid 
     * characters or non-integer values. It continues reading input until the user types "finish."
     * 3. Sorts the collected integers in ascending order from smallest to largest.
     * 4. Creates a Stack data structure and stores the sorted integers within it.
     * 5. Displays the sorted integers as they are stored in the stack.
     *
     * This method demonstrates code reuse by using the Scanner class
     * to handle input more efficiently and the Collections.sort method to sort the list more conveniently.
     *
     * @param args No command line arguments are used.
     */
    public static void main(String[] args) {
        // Previous version used LinkedList for sorted insertion
        // List<Integer> numbers = readAndSortIntegerInput(); // Old logic

        // Maintenance task: Now using a Stack, sort at the end
        List<Integer> numbers = readIntegerInput(); 
        Collections.sort(numbers); 

        Stack<Integer> sortedStack = new Stack<>();
        for (int number : numbers) {
            sortedStack.push(number); 
        }

        printSortedStack(sortedStack);
    }

    /**
     * Reads a list of integers from the user's input.
     *
     * This method repeatedly prompts the user to enter integers separated by spaces.
     * It will handle potential input errors such as non-integers and allow the user to end input if necessary
     * by typing the word "finish" (not case sensitive).
     *
     * This method will reuse the existing java libraries to make the code more efficient and convenient.
     * 1. Scanner: this helps read the user's input. It has functions like hasNext() which checks 
     * if there's more input to read and next() which grabs the next piece of input if it needs to. 
     * This makes it more convenient to handle user input.
     * 2. LinkedList: Using this type of list because it's very efficient when we need to 
     * add things to the list dynamically, which is what we're doing as the user enters more numbers.
     * 3. equalsIgnoreCase: this lets us compare the user's input to the word "finish" 
     * without worrying about whether they typed it in uppercase or lowercase. It is not case sensitive.
     * It makes our program more user-friendly.
     * 4. Integer.parseInt: this takes the user's input, 
     * which is treated as text at first, and then converts it into a number so it can do calculations 
     * and comparisons with it if that is needed.
     *
     * @return A list of integers entered by the user.
     */
    private static List<Integer> readIntegerInput() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new LinkedList<>(); 

        System.out.println("Enter a list of integers separated by spaces. Type 'finish' to end:");

        while (scanner.hasNext()) {
            String input = scanner.next();
            if (input.equalsIgnoreCase("finish")) {
                break; 
            }

            try {
                int number = Integer.parseInt(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + input + ". Please enter an integer or type 'finish' to end.");
            }
        }

        return numbers;
    }

    /**
     * Prints the sorted stack of integers.
     *
     * @param sortedStack The sorted stack of integers to be printed.
     */
    private static void printSortedStack(Stack<Integer> sortedStack) {
        System.out.println("Here is the sorted stack:");
        for (int number : sortedStack) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}