public class Student implements Comparable<Student> {
    private String id, name;
    private int age;

    public Student() {
    }

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;

    }

    public String getId() {return id;}
    public void SetId(String id) { this.id = id;}

    public String getName() {return name;}
    public void SetName(String name) { this.id = name;}

    public int getAge() {return age;}
    public void SetAge(int age) { this.age = age;}

    @Override
    public int compareTo(Student std) {
        int num = this.getName().length()-std.getName().length();
        int num2 = num == 0 ? this.getName().compareTo(std.getName()):num;
        int num3 = num2 == 0 ? this.getAge()-std.getAge():num2;
        return num3;
    }
}
