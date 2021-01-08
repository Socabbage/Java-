import java.util.ArrayList;

public class OutOfMemoryError {
    public static void main(String[] args) throws Exception{
        try
        {
            ArrayList<Student> list = new ArrayList<Student>();
            ArrayList<Integer> list2 = new ArrayList<Integer>();
            int i = 121646;
            while (true) {
                Student a = new Student("xiaoming","1","21","069","0570");
                list.add(a);
                list2.add(i++);
            }
        } catch (Throwable e)
        {
            System.out.println("Error");
            System.exit(1);
        }
    }
}
