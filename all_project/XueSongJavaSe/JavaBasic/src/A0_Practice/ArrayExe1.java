package A0_Practice;

public class ArrayExe1 {
    public static void main(String[] args) {
        //给定一个有9个整数（1,6,2,3,9,4,5,7,8）的数组，先排序，然后输出排序后的数组的值。
        int []a={1,6,2,3,9,4,5,7,8};
        for (int j = 0; j < a.length-1; j++) {
            for (int i = 0; i < a.length-1; i++) {
                if (a[i]>a[i+1]){
                    int tmp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=tmp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }



    }
}
