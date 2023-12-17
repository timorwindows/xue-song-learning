package A0_Practice;
//案例:
//(1)创建Person类的对象，设置该对象的name、age和gender属性调用study方法，输出字符串“studying”;调用showAge()方法，返回age值;
// 调用addAge(int addAge)方法给对象的age属性值增加addAge岁。比如: 2岁
//(2)创建第二个对象，执行上述操作，体会同一个类的不同对象之间的关系。
public class Person {
        int age;
        String name;
        char sex;
        public void study(){
            System.out.println("studying");
        }
        public int showAge(){
            return age;
        }
        public void addAge(int addAge){
            age+=addAge;
        }
}
class PTest{
    public static void main(String[] args) {
        Person p=new Person();
        p.name="zs";
        p.age=1;
        p.sex='男';
        p.study();
        p.addAge(3);
        int age=p.showAge();
        System.out.println(age);

        Person p1=new Person();

        System.out.println( p1.age);//0
        p1.addAge(12);
        int p1a=p1.showAge();
        System.out.println(p1a);
    }
}
