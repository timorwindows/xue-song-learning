//给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
//你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。你可以按任意顺序返回答案。
//示例 1：
//输入：nums = [2,7,11,15], target = 9
//输出：[0,1]
//解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
//示例 2：
//输入：nums = [3,2,4], target = 6
//输出：[1,2]
//示例 3：
//输入：nums = [3,3], target = 6
//输出：[0,1]
public class sum {
    public static void main(String[] args) {
        sum s=new sum();
        int[] m={1,2,3};

        int[] ints = s.twoSum(m, 5);
        for(int i=0;i<ints.length;i++){
            System.out.println(ints[i]);
        }
    }

    public int[] twoSum(int[] nums, int target) {
    int[]a=new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j =i+1; j<nums.length; j++) {
                if (nums[i]+nums[j]==target){
                    a[0]=i;
                    a[1]=j;
                    return a;
                }
            }
        }

        return null;
    }
}
