import java.util.Scanner;

public class Hex2Dec02 {
    /** Main method*/
    public static void main(String[] args) throws Exception {
        // Creat a Scanner
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter a String
        System.out.print("Enter a hex numbers: ");
        String hex = input.nextLine();

        System.out.print("The decimal value for hex number "
                + hex + " is " + hexToDecimal(hex.toUpperCase()));
    }

    public static int hexToDecimal(String hex) {
        int decimalValue = 0;
        try {
            for (int i = 0; i < hex.length(); i++) {
                char hexChar = hex.charAt(i);
                decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
            }
        }
        catch (HexFormatException e) {
            System.out.println(e.getMessage());
        }
        return decimalValue;
    }

    public static int hexCharToDecimal(char ch) throws HexFormatException{
        if (!(ch >= '0' && ch <= '9') && !(ch >= 'A' && ch <= 'F'))
        {
            throw new HexFormatException("输入字符串不是十六进制数，请重头再来");
        }
        if (ch >= 'A' && ch <= 'F') {
            return 10 + ch - 'A';
        }
        else if (ch >= '0' && ch <= '9') {// ch is '0', '1', …, or '9'
            return ch - '0';
        }
        return 1;
    }
}
