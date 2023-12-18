package A0_Practice;

public class ArrayTest1 {
    public static void main(String[] args) {
        //案例1：获取arr数组中所有元素的和提示：使用for的嵌套循环即可
        int[][]arr =new int[][]{{3,5,8},{12,9},{7,0,6,4}};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
        }
        System.out.println("总和为"+sum);
    }
}
