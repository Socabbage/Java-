package 第四次作业_大组长给我力量;

public class _7_23 {
	public static void main(String[] args) {
        boolean[] n;
        n = new boolean[100];
        for(int i=0;i<100;++i)
        {
            n[i]=false;
        }
        int t=1;
        for(int j=0;j<100;j+=t)
        {
            n[j]=!n[j];
            if(j==99)
            {
                j=0;
                t+=1;
            }
        }
        int total=0;
        for(int k=0;k<100;++k)
        {
            if(n[k])
            {
                total+=1;
            }
        }
        System.out.println(total);
    }
}
