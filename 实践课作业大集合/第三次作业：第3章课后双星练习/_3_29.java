package 第二次作业_星星哥给我力量;

import java.util.Scanner;

public class _3_29 {

	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
        System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double r1 = input.nextDouble();
        System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double r2 = input.nextDouble();
        if(Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2)) + r2 <= r1)
            System.out.println("circle2 is inside circle1");
        else if(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2) >= Math.pow(r1+r2, 2))
            System.out.println("circle2 does not overlap circle1");
        else
            System.out.println("circle2 overlaps circle1");
	}

}
