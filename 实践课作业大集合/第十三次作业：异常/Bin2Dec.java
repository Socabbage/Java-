import javax.naming.NameNotFoundException;
import java.util.Scanner;

public class Bin2Dec {

    /** Main method*/
    public static void main(String[] args) throws Exception {
        // Creat a Scanner
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter a String
        System.out.print("Enter a bin numbers: ");
        String bin = input.nextLine();

        System.out.print("The decimal value for bin number "
                + bin + " is " + binToDecimal(bin.toUpperCase()));
    }

    public static int binToDecimal(String bin) {
        int decimalValue = 0;
        try {
            for (int i = 0; i < bin.length(); i++) {
                char binChar = bin.charAt(i);
                decimalValue = decimalValue * 2 + binCharToDecimal(binChar);
            }
        }
        catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        return decimalValue;
    }

    public static int binCharToDecimal(char ch) throws NumberFormatException{
        if (!(ch == '0' || ch == '1'))
        {
            throw new NumberFormatException("输入字符串不是二进制数，请重头再来");
        }
        if(ch == '0')
        {
            return 0;
        }
        else if(ch == '1')
        {
            return 1;
        }
        return 1;
    }
}
