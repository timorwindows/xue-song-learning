package A0_Practice;

public class ForTest3 {
    public static void main(String[] args) {
        //用for循环改写从1到100的所有奇数相加的和
        int sum=0;
        for(int i=1;i<101;i++){
            if(i%2!=0){
//                System.out.println(i);
                sum+=i;
            }
        }System.out.println(sum);

    }
}
