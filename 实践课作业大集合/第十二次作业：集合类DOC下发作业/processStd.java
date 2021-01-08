import java.io.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class processStd {
    public static void main(String[] args) throws IOException {
        Set<Student> students = new TreeSet<Student>();

        System.out.println("请按照学号-姓名-年龄的顺序输入学生信息");
        Scanner input=new Scanner(System.in);
        String id,name,age;
        String str;
        int num = 0;
        while(true) {
            str = input.nextLine();
            if(str.equals("exit"))
            {
                break;
            }
            String[] str2 = str.split("-");
            // System.out.println(str2[1]);
            Student std = new Student(str2[0], str2[1], Integer.parseInt(str2[2]));
            students.add(std);
            num++;
        }

        for(Student s:students)
        {
            System.out.println(s.getId()+'-'+s.getName()+'-'+s.getAge());
        }
    }


}
