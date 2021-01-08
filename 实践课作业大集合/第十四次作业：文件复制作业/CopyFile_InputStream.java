import java.io.*;

public class CopyFile_InputStream {
    public static void main(String[] args) throws IOException {
        File file = new File("E:/00编程/文件复制/src/example.txt");
        FileInputStream inputFile = new FileInputStream(file);

        byte[] array = new byte[inputFile.available()];
        inputFile.read(array);
        inputFile.close();

        String str = new String(array);
        inputFile.close();

        System.out.println(str);

        FileOutputStream outputFile = new FileOutputStream("temp2.txt");
        for(int i=0;i<array.length;++i) {
            outputFile.write(array[i]);
        }
        outputFile.close();
    }
}
