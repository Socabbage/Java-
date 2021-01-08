package 差点又cun了_我为什么不把东西都放在一个项目里;

import java.util.Scanner;

public class program2_4 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		final double PI = 3.14159;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number for radius:");
		double radius = input.nextDouble();
		double area = radius*radius*PI;
		System.out.println("The area for the circle of radius " + 
		  radius + " is " + area);
	}

}
