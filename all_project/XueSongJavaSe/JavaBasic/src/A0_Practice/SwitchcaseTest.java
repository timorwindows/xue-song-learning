package A0_Practice;

public class SwitchcaseTest {
    public static void main(String[] args) {
        int n=1;
        switch (n){
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
        }
        //使用switch-case实现: 对学生成绩大于60分的，输出“合格”。低于60分的，输出“不合格”
        int score=90;
        switch (score/10){
            case 1:
                System.out.println("不及格");
            break;
            case 2:
                System.out.println("不及格");
                break;
            case 3:
                System.out.println("不及格");
                break;
            case 4:
                System.out.println("不及格");
                break;
            case 5:
                System.out.println("不及格");
                break;
            case 6:
                System.out.println("及格");
                break;
            case 7:
                System.out.println("及格");
                break;
            case 8:
                System.out.println("及格");
                break;
            case 9:
                System.out.println("及格");
                break;
        }


    }
}
