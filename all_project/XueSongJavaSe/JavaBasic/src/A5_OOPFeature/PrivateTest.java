package A5_OOPFeature;
//封装
public class PrivateTest {
    public static void main(String[] args) {
        Student student=new Student();
        student.setAge(1);
        System.out.println(student.getAge());
    }
}
class Student{
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}