public class Student {
    // 用户名
    private String name;

    private String code;

    // 年龄
    private String age;

    // 身份证号
    private String id;

    // 电话
    private String telephone;

    public Student() {
    }

    public Student(String name, String code, String age, String id, String telephone) {
        this.name = name;
        this.code = code;
        this.age = age;
        this.id = id;
        this.telephone = telephone;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getAge() { return age; }
    public void setAge(String age) { this.age = age; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTelephone() { return telephone; }
    public void setTelephone(String telephone) { this.telephone = telephone; }
}
