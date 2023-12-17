package A3_Array;

public class BubbleSort {
    public static void main(String[] args) {
        //:使用冒泡排序，实现整型数组元素的排序操作
        int[] arr = new int[]{34,54,3,2,65,7,34,5,76,34,67};
        for (int j = 0; j < arr.length-1; j++) {
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i]>arr[i+1]){
                    int tmp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=tmp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}
