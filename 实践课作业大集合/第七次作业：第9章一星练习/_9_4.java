package ���ߴ���ҵ;

import java.util.Random;

public class _9_4 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Random randomnumbers=new Random(1000);
        int tot=50;
        while(tot>0)
        {
            System.out.println(randomnumbers.nextInt(100));
            tot--;
        }
	}

}
