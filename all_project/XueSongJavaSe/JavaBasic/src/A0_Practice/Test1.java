package A0_Practice;

public class Test1 {
    public static void main(String[] args) {
        //二分查找
        // 查找元素5是否在上述数组中出现过?如果出现，输出对应的索引值。
        int[] arr = new int[]{2,4,5,8,12,15,19,26,37,49,51,66,89,100};
        int n=5;
        int head=0;
        int end=arr.length-1;

        while (head<=end){
            int mid=(head+end)/2;
            if (n==arr[mid]){
                System.out.println("找到了");
                break;
            } else if (n>arr[mid]) {
                head=mid+1;
            }else if (n<arr[mid]){
                end=mid-1;
            }
        }
    }
}
