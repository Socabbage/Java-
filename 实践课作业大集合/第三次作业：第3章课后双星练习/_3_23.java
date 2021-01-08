package 第二次作业_星星哥给我力量;

import java.util.Scanner;

public class _3_23 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        if((a <= 5 && a >= -5) && (b >= -2.5 && b <= 2.5))
            System.out.println(String.format("point (%.1f, %.1f) is in the rectangle", a, b));
        else
            System.out.println(String.format("point (%.1f, %.1f) is not in the rectangle", a, b));
	}

}
