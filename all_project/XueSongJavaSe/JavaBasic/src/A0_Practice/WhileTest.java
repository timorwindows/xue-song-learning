package A0_Practice;

import java.util.Scanner;

public class WhileTest {

public static void main(String[] args) {
    //随机生成一个100以内的数，猜这个随机数是多少？
// 从键盘输入数，如果大了，提示大了；如果小了，提示小了；如果对了，就不再猜了，并统计一共猜了多少次
//提示：生成—个[a,b]范围的随机数的方式：（int）（Math.random（）*（b－a+1）+a)

//    int n=(int)Math.random()*101;
//    Scanner scanner=new Scanner(System.in);
//    System.out.println("请输入数字");
//    int a=scanner.nextInt();
//    int count=1;
//    while (a!=n){//循环条件?不相等就继续循环
//        if(a>n){
//            System.out.println("大了");
//        }else if(a<n){
//            System.out.println("小了");
//        }a=scanner.nextInt();
//        count++;
//    }
//    System.out.println("猜对了");
//    scanner.close();
//    System.out.println(count);


    //案例：从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入为0时结束程序
    Scanner scanner=new Scanner(System.in);
    System.out.println("请输入整数");
    int a=scanner.nextInt();
    int countz=0;
    int countf=0;
    while (a!=0){
        System.out.println("请输入整数");
       a=scanner.nextInt();
       if(a>0){
           countz++;
       } else if (a<0) {
           countf++;
       }
    }
    System.out.println("正数个数为"+countz);
    System.out.println("负数个数为"+countf);
    scanner.close();

}
}
