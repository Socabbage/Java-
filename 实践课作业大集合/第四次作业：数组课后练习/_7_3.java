package 第四次作业_大组长给我力量;

import java.util.Scanner;

public class _7_3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the integers between 1 and 100: ");
        int[] numbers;
        int[] buckets;
        numbers = new int[100];
        for(int i=0;i<100;i++)
        {
            numbers[i]=0;
        }
        int t=input.nextInt();
        while(t!=0)
        {
            numbers[t-1]++;
            t=input.nextInt();
        }
        for(int j=0;j<100;j++)
        {
            if(numbers[j]!=0)
            {
                System.out.print(j+1);
                System.out.print(" occurs ");
                System.out.print(numbers[j]);
                System.out.println(" times");
            }
            }
        }
}
