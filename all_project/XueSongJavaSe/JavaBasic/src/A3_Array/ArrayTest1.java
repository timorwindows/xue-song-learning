package A3_Array;

import java.util.Scanner;

public class ArrayTest1 {
    //从键盘读入学生成绩，找出最高分，并输出学生成绩等级

    public static void main(String[] args) {
        //1. 从键盘输入学生的人数，根据人数，创建数组(动态初始化)
        System.out.println("请输入学生的人数");
        Scanner sc =new Scanner(System.in);
        int count=sc.nextInt();
        int score[]=new int[count];
        //2. 根据提示，依次输入学生成绩，并将成绩保存在数组元素中
        System.out.println("请输入学生的成绩");
        for (int i = 0; i < score.length; i++) {
            score[i]=sc.nextInt();
        }
        //3. 获取学生成绩的最大值
        int MaxScore=0;
        for (int i = 0; i < score.length; i++) {
            if (MaxScore<score[i]){
                MaxScore=score[i];
            }
        }
        System.out.println("成绩最大值为"+MaxScore);




    }


}
