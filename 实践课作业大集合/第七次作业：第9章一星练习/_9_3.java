package 第七次作业;

import java.util.Date;

public class _9_3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Date d=new Date();
        long a=10000;
        int tot=8;
        while(tot>0)
        {
            d.setTime(a);
            System.out.println(a+"->"+d.toString());
            a*=10;
            tot--;
        }
	}

}
