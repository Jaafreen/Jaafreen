package lab;

import java.util.Scanner;

class AreaOfSquare {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter side of a Square:");
		double side = scan.nextDouble();
		double area = side*side;
		System.out.println("Area of Square is " + area);

	}

}
