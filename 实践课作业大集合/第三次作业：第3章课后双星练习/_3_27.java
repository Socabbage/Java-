package 第二次作业_星星哥给我力量;

import java.util.Scanner;

public class _3_27 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter a point's x- and y-coordinates: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        if(a > 0 && b > 0 && a*-0.5 - b + 100 > 0)
            System.out.println("The point is in the triangle");
        else
            System.out.println("The point is not in the triangle");
	}

}
