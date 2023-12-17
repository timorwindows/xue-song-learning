package A0_Practice;

public class ForTest1 {
    //题目:输出所有的水仙花数，所谓水仙花数是指一个3位数，其各个位上数宁立方和等于其本身
    // 例如:153 = 1*1*1 + 3*3*3 + 5*5*5
    public static void main(String[] args) {
        //个位数i%10 十位数i/10%10 百位数i/100


        for (int i=100;i<1000;i++){
            int g=i%10;
            int s=i/10%10;
            int b=i/100;
            if(g*g*g+s*s*s+b*b*b==i){
                System.out.println("水仙花数为："+i);
            }
        }
    }
}
