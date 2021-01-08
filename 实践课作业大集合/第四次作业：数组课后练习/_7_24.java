package 第四次作业_大组长给我力量;

public class _7_24 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		int[] deck = new int[52];
        String[] suits = {"Spades","Hearts","Diamonds","Clubs"};
        String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};

        for(int i = 0; i < deck.length; i++)
            deck[i]=i;
        int[] tip = new int[4];
        for(int i = 0; i < 4; ++i)
        {
            tip[i]=0;
        }
        for(int i = 0; i < deck.length; i++)
        {
            int index = (int)(Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
        int total = 0;
        boolean tiptip = false;
        for(int i = 0; i < 51; i++)
        {
           if(tip[deck[i] / 13] != 1) {
               String suit = suits[deck[i] / 13];
               String rank = ranks[deck[i] % 13];
               System.out.println(rank + " of " + suit);
           }
            tip[deck[i] / 13] = 1;
            total++;
            for(int j = 0; j < 4; ++j)
            {
                tiptip = true;
                if(tip[j] == 0)
                {
                    tiptip = false;
                    break;
                }
            }
            if(tiptip)
            {
                break;
            }
        }
        System.out.println("Number of picks: " + total);
    }

}
