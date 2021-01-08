import java.io.*;
import java.util.Scanner;


public class CopyFile {
    public static void main(String[] args) throws IOException {
        File myFile = new File("E:/00编程/文件复制/src/example.txt");
        Scanner inputFile = new Scanner(myFile);
        String str = "";
        while(inputFile.hasNext()) {
            str += inputFile.nextLine();
        }
        inputFile.close();

        PrintWriter outputFile = new PrintWriter("temp.txt");
        outputFile.println(str);
        outputFile.close();
    }
}
