package 第四次作业_大组长给我力量;

import java.util.Scanner;

public class _7_31 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
        System.out.print("Enter list1: ");
        int n1;
        n1 = input.nextInt();
        int[] n2;
        n2 = new int[n1];
        for (int i = 0; i < n1; ++i) {
            n2[i] = input.nextInt();
        }
        System.out.print("Enter list2: ");
        int m1;
        m1 = input.nextInt();
        int[] m2;
        m2 = new int[m1];
        for (int i = 0; i < m1; ++i) {
            m2[i] = input.nextInt();
        }
        bubble(n2);
        bubble(m2);

        for(int ii=0;ii<merge(n2,m2).length;ii++)
        {
            System.out.print(merge(n2,m2)[ii]);
            if(ii!=merge(n2,m2).length-1)
            {
                System.out.print(' ');
            }
            else
            {
                System.out.println();
            }
        }

    }

    public static int[] merge(int[] list, int[] list2) {
        int tip = 0;
        int[] t;
        t = new int[list.length + list2.length];
        for (int i = 0, j = 0; i < list.length + list2.length;) {

            if (list[i] <= list2[j]) {
                t[tip] = list[i];
                i++;
            }
            else
            {
                t[tip] = list2[j];
                j++;
            }
            tip++;
            if (i >= list.length) {
                for (int k = j; k < list2.length; k++)
                {
                    t[tip] = list2[k];
                    tip++;
                }
                break;
            }
            if (j >= list2.length) {
                for (int k = i; k < list.length; k++)
                {
                    t[tip] = list[k];
                    tip++;
                }
                break;
            }
        }
        return t;
    }
        public static void bubble(int[] n){
            for (int i = 0; i < n.length; i++) {
                for (int j = n.length-1; j > i; j--) {
                    if (n[j] < n[j - 1]) {
                        int tempdouble = n[j];
                        n[j] = n[j - 1];
                        n[j - 1] = tempdouble;
                    }
                }
            }
	}

}
