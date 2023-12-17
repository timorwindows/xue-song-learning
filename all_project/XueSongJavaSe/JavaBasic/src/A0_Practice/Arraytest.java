package A0_Practice;

import java.util.Arrays;

public class Arraytest {
    public static void main(String[] args) {
        //array工具类
        int arr[]={18,25,7,36,13,2,89,63};
        System.out.println(Arrays.toString(arr));//[18, 25, 7, 36, 13, 2, 89, 63] 输出元素信息

        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = new int[]{1,2,3,4,5};
        System.out.println(arr1==arr2);//比较的是地址


        boolean b=Arrays.equals(arr1,arr2);//比较的是内容
        System.out.println(b);

        int[] arr3 = new int[]{34,54,3,2,65,7,34,5,76,34,67};
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));//自动排序
    }
}
