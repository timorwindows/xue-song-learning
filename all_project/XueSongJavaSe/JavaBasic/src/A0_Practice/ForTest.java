package A0_Practice;

public class ForTest {
    public static void main(String[] args) {
        for (int i=1;i<6;i++){
            System.out.println("helloworld");
        }
        //遍历1-100以内的偶数，并获取偶数的个数，获取所有的偶数的和
        //偶数n%2==0
        int count=0;
        int sum=0;
       for(int i=1;i<101;i++){
           if(i%2==0){
               System.out.println(i);
               count++;
               sum+=i;
           }
       }
        System.out.println("偶数的个数为"+count);
        System.out.println(sum);
    }
}
