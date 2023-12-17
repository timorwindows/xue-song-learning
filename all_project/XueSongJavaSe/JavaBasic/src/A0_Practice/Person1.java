package A0_Practice;
/*
创建程序，在其中定义两个类: Person和PersonTest类。定义如下:
用setAge()设置人的合法年龄(0~130)，用getAge()返回人的年龄
在PersonTest类中实例化Person类的对象b，调用setAge()和getAge()方法，体会Java的封装性。
 */
public class Person1{
    private int age;
    public void setAge(int a){
        if(a>0&&a<130){
            age=a;
        }else{
            System.out.println("你输入的年龄有误");
        }
    }
    public int getAge(){
        return age;
    }
}
class Person1Test{
    public static void main(String[] args) {
        Person1 person1=new Person1();
        person1.setAge(12);

        System.out.println(person1.getAge());
    }
}
