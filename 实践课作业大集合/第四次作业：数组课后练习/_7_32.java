package 第四次作业_大组长给我力量;

import java.util.Scanner;

public class _7_32 {
	public static void main(String[] argus) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list size: ");
        int n = input.nextInt();
        System.out.print("Enter list content: ");
        int[] a;
        a = new int[n];
        for(int i=0;i<n;++i)
        {
            a[i]=input.nextInt();
        }
        int t;
        t = partition(a);
        System.out.print("After the partition, the list is ");
//            for(int i=0;i<n;++i)
//            {
//                System.out.print(a[i]);
//                if(a[i]!=n-1)
//                {
//                    System.out.print(" ");
//                }
//                else
//                {
//                    System.out.println();
//                }
//            }
        sort(a);
}
public static int partition(int[] list){
    int[] b,c;
    b=new int[list.length];
    c=new int[list.length];
    for(int i=0;i<list.length;++i)
    {
        if(i==0)
            c[i]=2;
        else
            c[i]=0;
    }
    for(int i=1,j=1;i<list.length;++i,++j)
    {
        if(list[i]<=list[0])
        {
            c[j]=1;
        }
        else if(list[i]>list[0])
        {
            c[j]=0;
        }
    }
    int ans=-1,k=0;
    for(int i=0;i< list.length;++i)
    {
        if(c[i]==1)
        {
            k++;
        }
    }
    ans=k;

    return ans;
}
public static void sort(int[] list)
{
    int[] b,c;
    b=new int[list.length];
    c=new int[list.length];
    for(int i=0;i<list.length;++i)
    {
        if(i==1)
            c[i]=2;
        else
            c[i]=0;
    }
    for(int i=1,j=1;i<list.length;++i,++j)
    {
        if(list[i]<=list[0])
        {
            c[j]=1;
        }
        else if(list[i]>list[0])
        {
            c[j]=0;
        }
    }
    for(int i=0;i< list.length;++i)
    {
        if(c[i]==1)
        {
            System.out.print(list[i]);
            System.out.print(" ");
        }
    }
    for(int i=0;i< list.length;++i)
    {
        if(c[i]==2)
        {
            System.out.print(list[i]);
            System.out.print(" ");
        }
    }
    for(int i=0;i<list.length;++i)
    {
        if (c[i] == 0) {
            System.out.print(list[i]);
            System.out.print(" ");
        }
    }
}

}
