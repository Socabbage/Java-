package dodo;

import java.util.Random;
import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Random r = new Random(1);
        int[][] arry=new int[100][100];
        /**
         * 生成矩阵
         * */
        for(int i=0;i<n;++i) {
            for(int j=0;j<n;++j) {
                int t = r.nextInt(2);
                arry[i][j] = t;
                System.out.print(t);
                if(j == n-1)
                    System.out.println();
                else
                    System.out.print(' ');
            }
        }
        /**
         * 计算最多1的行
         * */
        System.out.print("最多1的行是：");
        int row=1,sum=0,max=0;
        for(int i=0;i<=n-1;++i) {
            for(int j=0;j<=n-1;++j) {
                if(arry[i][j] == 1)
                    sum++;
            }
            if(sum>max) {
                max = sum;
                row = i+1;
            }
            sum=0;
        }
        System.out.println(row);
        System.out.print("最多1的列是：");
        int c=1;
        sum=0;
        max=0;
        for(int i=0;i<=n-1;++i) {
            for(int j=0;j<=n-1;++j) {
                if(arry[j][i] == 1)
                    sum++;
            }
            if(sum>max) {
                max = sum;
                c = i+1;
            }
            sum=0;
        }
        System.out.println(c);
    }
}
