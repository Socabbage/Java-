package dodo;

import com.sun.deploy.util.ArrayUtil;

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class remove {
    public static void main(String[] args) {
        System.out.print("Enter ten integers: ");
        Scanner input = new Scanner(System.in);
        int[] r = new int[10];
        r[0] = input.nextInt();
        int i,j;
        for(i=1,j=0;i<=9 && j<9;++j)
        {
            int t = input.nextInt();
            List<Integer> list = Arrays.stream(r).boxed().collect(Collectors.toList());
            boolean result = list.contains(t);
            r =  list.stream().mapToInt(Integer::valueOf).toArray();
            if(!result){
                r[i] = t;
                ++i;
            }
        }
        System.out.print("The distinct intergers: ");
        for(int k=0;k<i;++k){
            System.out.print(r[k]);
            if(k == i-1)
                System.out.println();
            else
                System.out.print(" ");
        }
    }
}
