package A0_Practice;

public class ArrayExe2 {
    public static void main(String[] args) {
        //在一个有8个整数（18，25，7，36，13，2，89，63）的数组中找出其中最大的数及其下标。
        int arr[]={18,25,7,36,13,2,89,63};
        int max=arr[0];
        int i = 0;
        for (; i < arr.length; i++) {
            if (max<arr[i]) {
                max=arr[i];System.out.println("最大值为"+max+"下标为"+i);
            }
        }






    }
}