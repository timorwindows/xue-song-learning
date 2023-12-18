package A0_Practice;
//嵌套循环
public class NestFor {
    public static void main(String[] args) {
        //打印
        /*
        *
        **
        ***
        ****
        *****
      */
//        for(int i=1;i<=5;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//
//        题目：找出100以内所有的素数（质数）
        boolean isflag=true;
        for(int i=2;i<100;i++){

                for(int j=2;j<i;j++){//判断i是否为质数
                    if(i%j==0){
                        isflag=false;
                    }
                }
                if(isflag){
                    System.out.println(i);
                }
                isflag=true;//重置
            }





    }
}
