package A0_Practice;

public class RecursionExe {
    //递归练习
    public static void main(String[] args) {
        int a = Add(2);
        System.out.println(a);
        System.out.println(plus(5));
    }

    public static int Add(int num) {
        if (num==1){
            return 1;
        }else {
            return Add(num-1)+num;
        }
    }
    public static int plus(int num){
        if(num==1){
            return 1;
        }else {
            return num * plus(num-1);
        }
    }

}