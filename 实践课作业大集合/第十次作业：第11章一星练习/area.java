package dodo;

import java.awt.*;
import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        System.out.print("Enter the number of the points: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double s,ts=0;
        System.out.println("Enter the coordinates of the points: ");
        double[] pointx = new double[1000];
        double[] pointy = new double[1000];
        for(int i=0;i<n;++i)
        {
            pointx[i]=input.nextDouble();
            pointy[i]=input.nextDouble();
        }
        for(int i=0;i<n;++i)
        {
            if(i == n-1)
            {
                ts+=pointx[i]*pointy[0]-pointx[0]*pointy[i];
            }
            else ts+=pointx[i]*pointy[i+1]-pointx[i+1]*pointy[i];
        }
        s = 0.5*Math.abs(ts);
        System.out.println(String.format("The total area is %.3f",s));
    }
}
