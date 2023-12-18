package A0_Practice;

import A4_Method.Student;

import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        //用一个数组，保存星期一到星期天的7个英语单词，从键盘输入1-7，显示对应的单词
//        String[] d={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("请输入数字");
//         int input=scanner.nextInt();
//        System.out.println(d[input-1]);
//        scanner.close();

       //从键盘读入学生成绩，找出最高分，并输出学生成绩等级
        // 成绩>=最高分-10等级为'A'
        //成绩>=最高分-20等级为'B
        // 成绩>=最高分-30等级为'C
        // 其余等级为'D  提示：先读入学生人数，根据人数创建int数组，存放学生成绩。
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入学生人数");
        int Scount=scanner.nextInt();
        int[] Score=new int[Scount];
        System.out.println("请输入学生的成绩");
        //创建成绩数组
        for(int i=0;i<Score.length;i++){
            Score[i]=scanner.nextInt();
        }

        //遍历成绩数组
        int max=Score[0];
        for(int i=0;i<Score.length;i++){
            //获取成绩最大值
            if(max<Score[i]){
                max=Score[i];
            }
        }
        System.out.println("最高分为"+max);

        for(int i=0;i<Score.length;i++){
            if(Score[i]>=max-10){
                System.out.println("student"+i+"Score是"+Score[i]+"成绩等级为A");
            } else if (Score[i]>=max-20) {
                System.out.println("student"+i+"Score是"+Score[i]+"成绩等级为B");
            }else if (Score[i]>=max-30) {
                System.out.println("student"+i+"Score是"+Score[i]+"成绩等级为C");
            }else {
                System.out.println("student"+i+"Score是"+Score[i]+"成绩等级为D");
            }
        }scanner.close();
    }
}
