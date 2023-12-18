import java.util.Scanner;

public class IfTest {
    public static void main(String[] args) {
        //案例1：成年人心率的正常范围是每分钟60-100次。体检时，
// 如果心率不在此范围内，则提示需要做进一步的检查。
//        int heart=22;
//        if(heart>60&&heart<100){
//            System.out.println("健康");
//        }else {
//            System.out.println("需要进一步检查");
//        }



        ///*案例2:定义一个整数，判定是偶数还是奇数*/
//        int num=4;
//        if(num%2==0){
//            System.out.println("这是偶数");
//        }else {
//            System.out.println("这是奇数");
//        }



        //岳小鹏参加Java考试，他和父亲岳不群达成承诺：
        // 如果：成绩为100分时，奖励一辆跑车；
        // 成绩为（80，99]时，奖励一辆山地自行车；
        // 当成绩为[60，80]时，奖励环球影城一日游
        // ；其它时，胖揍一顿。说明：默认成绩是在[0,100]范围内
//        int score=99;
//        if(score==100){
//            System.out.println("跑车");
//        }else if(score>80&&score<=99){
//            System.out.println("自行车");
//        }else if(score>60&&score<=80){
//            System.out.println("环球");
//        }else if(score>0&&score<=60){
//            System.out.println("打");
//        }else {
//            System.out.println("成绩错误");
//        }



//        案例：由键盘输入三个整数分别存入变量num1、num2、num3，
//        对它们进行排序（使用if-elseif-else），并且从大到小输出。
//        Scanner sc=new Scanner(System.in);
//        System.out.println("请输入三个整数");
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int c=sc.nextInt();
//        if (a<b){
//            if(c<a){
//                System.out.println(b+","+a+","+c);
//            }else if(c>b){
//                System.out.println(c+","+b+","+a);
//            }else {
//                System.out.println(b+","+c+","+a);
//            }
//        }else if(a>b){
//            if(c<b){
//                System.out.println(a+","+b+","+c);
//            }else if(c>a){
//                System.out.println(c+","+a+","+b);
//            }else {
//                System.out.println(a+","+c+","+b);
//            }
//        }sc.close();



    }
}
