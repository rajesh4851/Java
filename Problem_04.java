package corejava.assignment01;

import java.util.Scanner;

/*
(Area and perimeter of a circle) Write a program that displays the area and perimeter
of a circle that has a radius of 5.5 using the following formula:
					perimeter = 2 * radius * pi
					area = radius * radius * pi

SUGGESTIONS:
Use Math.PI for the pi value
 * History:
 * 06/11/2019 Rajesh Mattaparthi Made code changes
*/
public class Problem_04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Radius of a circle : \n");
		float radius = scanner.nextFloat();
		System.out.println("Radius = "+ radius);

		System.out.println("Perimeter = "+ (2 * radius * Math.PI));
		//System.out.println("TODO : Writer you code to print the perimeter");
		System.out.println("Area = "+(radius * radius * Math.PI));
		//System.out.println("TODO : Writer you code to print the Area");
	}
}