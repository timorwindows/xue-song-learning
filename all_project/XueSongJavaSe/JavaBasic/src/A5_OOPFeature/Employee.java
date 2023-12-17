package A5_OOPFeature;

import java.util.Scanner;

/*
案例：普通员工类（1）声明员工类EmpLoyee，
包含属性：姓名、性别、年龄、电话，属性私有化提供get/set方法提供StringgetInfo（)方法
（2）在测试类的main中创建员工数组，并从键盘输入员工对象信息，最后遍历输出
 */
public class Employee {
    private String name;
    private String sex;
    private int age;
    private  String number;

    public void setname(String n){
        name=n;
    }
    public String getname(){
        return name;
    }

    public  void setsex(String s){
        sex=s;
    }
    public String getsex(){
        return sex;
    }
    public void setage(int a){
        age=a;
    }
    public int getage(){
        return age;
    }
    public void setNumber(String num){
        number=num;
    }
    public String getNumber(){
        return number;
    }
    public String getInfo(){
        return getname()+getsex()+getage()+getNumber();
    }
}
class EmployeeTest{
    public static void main(String[] args) {
        Employee employee[]=new Employee[2];
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < employee.length; i++) {
            employee[i]=new Employee();//创建员工
            System.out.println("-----------添加第"+(i+1)+"个员工-------");
            System.out.println("请输入姓名");
            String name=scanner.next();
            System.out.println("请输入性别");
            String sex=scanner.next();
            System.out.println("请输入年龄");
            int age=scanner.nextInt();
            System.out.println("请输入电话");
            String number=scanner.next();
            //给指定的employee对象的各属性赋值
            employee[i].setname(name);
            employee[i].setsex(sex);
            employee[i].setage(age);
            employee[i].setNumber(number);

        }
        //遍历数组
        System.out.println("--------员工列表---------");
        for (int i = 0; i < employee.length; i++) {

            System.out.println(employee[i].getInfo());
        }


    }


}
