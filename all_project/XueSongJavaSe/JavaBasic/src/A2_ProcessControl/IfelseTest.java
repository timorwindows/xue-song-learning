package A2_ProcessControl;

public class IfelseTest {
    public static void main(String[] args) {
        int heartBeats=89;
        if(heartBeats>=60||heartBeats<=100){
            System.out.println("需要做检查");
        }
        System.out.println("体检结束");




        //定义一个整数判断是整数还是奇数
        int num=13;
        if(num%2==0){
            System.out.println("这是偶数");
        }
        System.out.println("这是基数");

        //岳小鹏参加Java考试，他和父亲岳不群达成承诺:如果:
        //成绩为100分时，奖励一辆跑车;
        //成绩为(80，99]时，奖励一辆山地自行车:
        //当成绩为[60,80]时，奖励环球影城一日游;
        //其它时，胖揍一顿。
        //说明: 默认成绩是在[0,100]范围内
        int score=61;
        if(score==100){
            System.out.println("获得跑车");
        } else if (score>80&&score<=99) {
            System.out.println("获得自行车");
        } else if (score>=60&&score<80) {
            System.out.println("去环球影城");
        }else {
            System.out.println("胖揍一顿");
        }
        //三个数从小到大排列
        int n1=30;
        int n2=21;
        int n3=44;
        if(n1>n2){
            if (n3>n1){
                System.out.println(n2+","+n1+","+n3);
            }else if (n3<n2){
                System.out.println(n3+","+n2+","+n1);
            }else{
                System.out.println(n2+","+n3+","+n1);
            }

        }else{//n1<n2
            if(n3<n1){
                System.out.println(n3+","+n1+","+n2);
            } else if (n3>n2) {
                System.out.println(n1+","+n2+","+n3);
            }else {
                System.out.println(n1+","+n3+","+n2);
            }

        }
    }
}
