package A2_ProcessControl;

public class ForTest2 {
    public static void main(String[] args) {
        //输入两个正整数m和n，求其最大公约数和最小公倍数。
        // 比如: 12和20的最大公约数是4，最小公倍数是60。
        //1 ,2,,3,4,6,12
        //1,2,4,5,10,20
        int m=10;
        int n=25;
        int r=(m<n)?m:n;
        int a=1;
        for(int i=1;i<=r;i++){
            if(m%i==0&&n%i==0){
                a=i;
            }
        }
        System.out.println("最大公约数为："+a);
       // int max=(m>n)?m:n;
        for(int i=1;i<=m*n;i++){
            if(i%m==0&&i%n==0){
                System.out.println(i);
                break;
            }
        }
    }
}
