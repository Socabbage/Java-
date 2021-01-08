package 第四次作业_大组长给我力量;

import java.util.Scanner;

public class _7_19 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
        System.out.print("Enter list: ");
        int t;
        int[] n;
        t = input.nextInt();
        n = new int[t];
        for (int i = 0; i < t; ++i) {
            n[i] = input.nextInt();
        }
        if (!isSorted(n)) {
            System.out.println("The list is not sorted");
        } else {
            System.out.println("The list is already sorted");
        }

    }
    public static boolean isSorted(int[] list1){
        for (int i = 0; i < list1.length-1; i++) {
            if (list1[i] > list1[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
