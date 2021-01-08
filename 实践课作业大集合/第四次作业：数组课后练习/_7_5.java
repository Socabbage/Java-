package 第四次作业_大组长给我力量;

import java.util.Scanner;

public class _7_5 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        int[] numbers;
        int[] t;
        numbers = new int[10];
        t = new int[10];
        for(int i=0;i<10;++i)
        {
            t[i]=0;
        }
        int a;
        for(int i=0;i<10;++i)
        {
            a = input.nextInt();
            numbers[a-1]++;
        }
        int total=0;
        for(int i=0;i<10;++i)
        {
            if(numbers[i]!=0)
            {
                total++;
            }
        }
        System.out.println("The number of distinct number is "+ total);
        System.out.print("The distinct numbers are: ");
        for(int i=0;i<10;++i)
        {
            if(numbers[i]!=0)
            {
                System.out.print(i+1);
                if(i!=9)
                    System.out.print(' ');
            }
        }
        System.out.println();
	}

}
