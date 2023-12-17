package A3_Array;

public class ArrayTest2 {
    public static void main(String[] args) {
        //定义数组: int[] arr = new int[]{34,54,3,2,65,7,34,5,76,34,67};如何实现数组元素的反转存储
        int[] arr = new int[]{31,42,51,62,75,86,99,51,80,34,67};

        for (int i = 0; i < arr.length/2; i++) {
           int tmp=arr[i];
           arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=tmp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
