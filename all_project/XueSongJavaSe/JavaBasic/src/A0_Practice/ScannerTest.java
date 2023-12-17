package A0_Practice;

import java.util.Scanner;

//scanner获取不同类型数据的步骤
//创建scanner类的实例
//
public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你的网名");
        String name=sc.next();
        System.out.println("请输入你的年龄");
        int age=sc.nextInt();
        sc.close();




    }
}
