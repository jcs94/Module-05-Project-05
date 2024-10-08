# Module-05-Project-05

## OrganizedStack

This project reads integers from user input, sorts them, and stores them in a stack. It shows the transition from using a “LinkedList” to a “Stack.”

## Some features

- Prompts the user to enter a list of integers separated by spaces.
- Reads and handles user input, including errors like invalid characters or non-integer values.
- Sorts the collected integers in ascending order.
- Stores sorted integers in a stack.
- Displays the sorted integers as stored in the stack.

## Running the project

Use the following commands in your terminal to generate documentation and run the program:

Command to generate documentation:
javadoc OrganizedStack.java

Command to run the program:
java OrganizedStack

## How It Works

1. The program displays a message asking the user to enter a list of integers separated by spaces and instructs them to type "finish" to end the input.
2. It reads the integers entered by the user, handling potential errors such as invalid characters or non-integer values. It continues reading input until the user types "finish."
3. It sorts the collected integers in ascending order.
4. The sorted integers are stored in a stack.
5. Finally, the sorted integers are displayed as they are stored in the stack.

## Explanation of the code

### main() method

This method follows these steps:

1. Prompts the user for a list of integers.
2. Reads the integers and handles any input errors.
3. Sorts the integers in ascending order.
4. Stores the sorted integers in a stack.
5. Displays the sorted integers in the stack.

### readIntegerInput() method:

This method reads a list of integers from the user's input, handles potential input errors, and allows the user to end input by typing "finish."