package ApnaCollege;

class Student {
    String name;
    static String school;
}

public class Static {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.name = "Emon"; // Input using object name
        Student.school = "BCBHC"; // Input using class name
        System.out.println(stu.name);
        System.out.println(Student.school);
    }
}