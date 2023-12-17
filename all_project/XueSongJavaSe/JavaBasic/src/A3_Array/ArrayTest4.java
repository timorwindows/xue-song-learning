package A3_Array;

public class ArrayTest4 {
    public static void main(String[] args) {
        //二分查找
        // 查找元素5是否在上述数组中出现过?如果出现，输出对应的索引值。
        int[] arr = new int[]{2,4,5,8,12,15,19,26,37,49,51,66,89,100};
        int n=1;
        int head=0;
        int end=arr.length-1;
        boolean b=true;
        while (head<=end){
            int middle=(head+end)/2;
            if (n==arr[middle]){
                System.out.println("找到了");
                b=false;
                break;
            } else if (n<arr[middle]) {
                end=middle-1;
            } else if (n>arr[middle]) {
                head=middle+1;
            }
        }if (b){
            System.out.println("没找到");
        }

    }
}
