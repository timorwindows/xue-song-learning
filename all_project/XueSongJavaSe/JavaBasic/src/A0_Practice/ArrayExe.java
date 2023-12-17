package A0_Practice;

import java.util.Scanner;

public class ArrayExe {
    public static void main(String[] args) {
        //用一个数组，保存星期一到星期天的7个英语单词，从键盘输入1-7，
        // 显示对应的单词["Monday","Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        String a[]={"Monday","Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入数字");
        int day=sc.nextInt();
        if (day<1||day>7){
            System.out.println("请重新输入");
        }else {
            System.out.println(a[day - 1]);
        }


sc.close();
    }


}
