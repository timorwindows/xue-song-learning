package A3_Array;
//线性查找
// 定义数组: int[] arr1 = new int[]{34,54,3,2,65,7,34,5,76,34,67}
// 查找元素5是否在上述数组中出现过了如果出现，输出对应的索引值。
public class ArrayTest3 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{34,54,3,2,65,7,34,5,76,34,67};
        int num=76;
        boolean flag=true;
        for (int i = 0; i < arr1.length; i++) {
            if (num ==arr1[i]) {
                System.out.println("找到了索引值为"+i);
                flag=false;
                break;
            }
        }
        if (flag==true) {
            System.out.println("未找到");
        }

    }
}
