package ���ߴ���ҵ;

import java.util.Date;

public class _9_3 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
