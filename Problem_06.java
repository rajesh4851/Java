package corejava.assignment01;

import java.util.Scanner;

/**
 * Solve (a + b) whole square = a square + b square + 2ab
 * Solve (4a + 5b)2
 *
 * Take the input from command prompt.
 * History:
 * 06/11/2019 Rajesh Mattaparthi Made code changes
 */
public class Problem_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number");
        int input1 = scanner.nextInt();
        System.out.println("Please enter second number");
        int input2 = scanner.nextInt();

        // Im using the math function to generate the square
        System.out.println("Result :");
        System.out.println(Math.pow((input1 + input2), 2) + " = "+ Math.pow(input1,2 )+ " + "+ Math.pow(input2,2) + " + "+ 2*input1*input2);
    }
}
