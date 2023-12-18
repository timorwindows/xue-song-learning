package A0_Practice;
//        for (1; 2 ; 4) { 执行顺序1 -> 2 ->3 -> 4 -> 2 -> 3 -> 4-
//            3
//        }
public class ForTest {
    public static void main(String[] args) {
        //        题目：遍历1-100以内的偶数，并获取偶数的个数，获取所有的偶数的和
//        int sum=0;
//        int j=0;
//        int i=1;
//        for(;i<101;i++){
//            if(i%2==0){
//                sum+=i;
//                j++;
//            }
//        }
//        System.out.println("偶数的个数为"+j+"和为"+sum);


//        题目：输出所有的水仙花数，所谓水仙花数是指一个3位数，其各个位上数字立方和等于其本身。
//        例如：153=1*1*1+3*3*3+5*5*5

//        for(int i=100;i<1000;i++){
//
//            int g=i%10;
//            int s=i/10%10;
//            int b=i/100;
//            if(g*g*g+s*s*s+b*b*b==i){
//                System.out.println(i);
//            }
//        }

//        说明：输入两个正整数m和n，求其最大公约数和最小公倍数。
//        比如：12和20的最大公约数是4，最小公倍数是60。
        int m=12;
        int n=20;
        int max=1;
//        for(int i=1;i<=m;i++){
//            if(m%i==0&&n%i==0){//怎么找出约数中最大的？找变量记录每次循环都会重新赋值
//                max=i;
//            }
//        }
        //System.out.println(max);
//        for(int i=m;i<=m*n;i++){
//            if(i%m==0&&i%n==0){
//                System.out.println(i);//怎么找出公倍数中最小的值？break满足条件就跳出循环
//                break;
//            }
//        }


    }
}
