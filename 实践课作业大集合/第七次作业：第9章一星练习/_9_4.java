package 第七次作业;

import java.util.Random;

public class _9_4 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Random randomnumbers=new Random(1000);
        int tot=50;
        while(tot>0)
        {
            System.out.println(randomnumbers.nextInt(100));
            tot--;
        }
	}

}
