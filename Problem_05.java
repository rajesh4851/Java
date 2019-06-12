package corejava.assignment01;

import java.util.Scanner;

/*
(Area and perimeter of a rectangle) Displays the area and
perimeter of a rectangle with the width of 6.5 and height of 4.9 using the following
formula:

						area = width * height
						perimeter = (width + height) * 2

NOTE:
	pass width and height as an input to the program.
 * History:
 * 06/11/2019 Rajesh Mattaparthi Made code changes
*/
public class Problem_05 {
	public static void main(String[] args) {
		System.out.println("Please enter the width");
		Scanner scanner = new Scanner(System.in);
		int width = scanner.nextInt();
		System.out.println("Please enter the height");
        int height = scanner.nextInt();

		System.out.println("Area = "+ (width*height));
		System.out.println("Perimeter = "+(width + height) * 2);

	}
}