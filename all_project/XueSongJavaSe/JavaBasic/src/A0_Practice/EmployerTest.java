package A0_Practice;
//案例:
//(1)声明一个MyDate类型，有属性: 年year，月month，日day
//(2)声明一个Employer类型，包含属性:编号、姓名、年龄、薪资、生日 (MyDate类型)
//(3)在EmployeeTest测试类中的main()中，创建两个员工对象，并为他们的姓名和生日赋值，并显示
public class EmployerTest {
    public static void main(String[] args) {
        Employer employer=new Employer();
        employer.id=1;
        employer.name="zs";
        employer.age=12;
        employer.salary=2000;
        employer.birthday=new MyDate();
        employer.birthday.year=1998;
        employer.birthday.month=6;
        employer.birthday.day=1;
        System.out.println("id=："+employer.id+"name："+employer.name+
                "age="+employer.age+"salary："+employer.salary+"生日："+"["+employer.birthday.year+"年"
                +employer.birthday.month+"月"+employer.birthday.day+"日"+"]");
    }
}
