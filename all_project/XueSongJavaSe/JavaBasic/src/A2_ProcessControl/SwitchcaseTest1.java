package A2_ProcessControl;

import java.util.Scanner;

public class SwitchcaseTest1 {
    public static void main(String[] args) {
        //编写程序:从键盘上输入2023年的“month”和“day”，要求通过程序输出输入的日期为2023年的第几天。
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入月份");
        int month=sc.nextInt();
        System.out.println("请输入天数");
        int day=sc.nextInt();
        int sum=0;
        switch (month){
            case 1:
                sum=day;
                break;
            case 2:
               sum=day+31;

                break;
        }
        System.out.println("23年"+month+"月"+day+"日是2023年的第"+sum+"天");
        sc.close();
    }
}
