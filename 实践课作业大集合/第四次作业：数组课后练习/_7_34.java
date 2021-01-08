package 第四次作业_大组长给我力量;

import java.util.Scanner;

public class _7_34 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
        System.out.print("Enter: ");
        String s;
        s = input.nextLine();
        s = sort(s);
        System.out.println(s);
        }
		public static String sort(String s){
	int a[];
	a=new int[26];
	for(int i=0;i<26;++i)
	{
	    a[i]=0;
	}
	for (int i = 0; i < s.length(); i++) {
	    a[(int)(s.charAt(i))-97]+=1;
	}
	s="";
	    for(int i=0,j=0,k=0;i<26;++i)
	    {
	        while(a[i]>0)
	        {
	            s+=(char)(97+k);
	            ++j;
	            a[i]--;
	        }
	        ++k;
	    }
	    return s;
	}
}
