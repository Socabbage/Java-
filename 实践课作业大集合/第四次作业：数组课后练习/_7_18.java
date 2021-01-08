package 第四次作业_大组长给我力量;

import java.util.Scanner;

public class _7_18 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers(please!): ");
        double[] n;
        n = new double[10];
        for(int i=0;i<10;++i)
        {
            n[i]=input.nextDouble();
        }
        bubble(n);
        for(int k=0;k<10;k++)
        {
            System.out.print(n[k]);
            if(k==9)
            {
                System.out.print("");
            }
            else
            {
                System.out.print(" ");
            }
        }
        System.out.println("");
    }

    static void bubble(double[] n){
        for (int i = 0; i < 10; i++) {
            for (int j = 9; j > i; j--) {
                if (n[j] > n[j - 1]) {
                    double tempdouble = n[j];
                    n[j] = n[j - 1];
                    n[j - 1] = tempdouble;
                }
            }
        }
    }

}
