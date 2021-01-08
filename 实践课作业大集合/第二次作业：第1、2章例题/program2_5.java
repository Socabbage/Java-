package 差点又cun了_我为什么不把东西都放在一个项目里;

import java.util.Scanner;

public class program2_5 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer for seconds:");
		int seconds = input.nextInt();
		
		int minutes = seconds / 60;
		int remainingSeconds = seconds % 60;
		System.out.println(seconds + " seconds is " + minutes +
		  "minutes and " + remainingSeconds + " seconds");
	}

}
