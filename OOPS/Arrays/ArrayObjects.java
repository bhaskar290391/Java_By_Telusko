package OOPS.Arrays;

class Student {
    int age;
    String name;
    int marks;

}

public class ArrayObjects {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.age = 25;
        s1.name = "Bhaskar";
        s1.marks = 85;

        s2.age = 31;
        s2.name = "Maddy";
        s2.marks = 95;

        s3.age = 45;
        s3.name = "Abc";
        s3.marks = 78;

        Student studentArray[] = new Student[3];
        studentArray[0] = s1;
        studentArray[1] = s2;
        studentArray[2] = s3;

        for (Student student : studentArray) {
            System.out.println(student.age + " : " + student.name);
        }
    }
}
