package A4_Method;

import java.util.Arrays;

/*
 * 案例:
 * 1) 定义类Student，包含三个属性: 学号number(int)，年级state(int)，成绩score(int)。
 * [2)创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
 * 问题一:打印出3年级(state值为3) 的学生信息。
 * 问题二:使用冒泡排序按学生成绩排序，并遍历所有学生信息提示:
 * 1) 生成随机数: Math.random()，返回值类型double;
 * 2) 四舍五入取整: Math.round(double d)，返回值类型Long。
 * 年级[1,6] : (int)(Math.random()*6 +1)
 * 分数[0,100] : (int)(Math.random() * 101)
 */
public class Student {
   int number;
   int state;
   int score;


}
class StudentTest{
    public static void main(String[] args) {
        //创建对象
        Student []s =new Student[20];

        for (int i = 0; i < s.length; i++) {
            //使用循环给数组的元素赋值
            s[i]=new Student();
            //给每个学生对象的number state score属性赋值
            s[i].number=i+1;
            s[i].state=(int)(Math.random()*6 +1);
            s[i].score=(int)(Math.random() * 101);
        }
        //问题一:打印出3年级(state值为3) 的学生信息。
        for (int i = 0; i < s.length; i++) {
            if (3 == s[i].state) {
                System.out.println("number:"+s[i].number+"state:"+s[i].state+"scoer:"+s[i].score);
            }
        }
        //问题二:使用冒泡排序按学生成绩排序，并遍历所有学生信息提示:
        for (int j = 0; j < s.length-1; j++) {
            for (int i = 0; i < s.length-1-i; i++) {

                if (s[i].score > s[i+1].score) {
                    Student tmp=s[i];
                    s[i]=s[i+1];
                    s[i+1]=tmp;
                }
            }
        }


        System.out.println(Arrays.toString(s));

    }
}
