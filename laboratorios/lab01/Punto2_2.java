public class Punto2_2 {
    //groupSum6
    public boolean groupSum6(int start, int[] nums, int target){
        if (start >= nums.length){
            return target == 0;
        }
        if (nums[start] == 6){
            return groupSum6(start + 1, nums, target - nums[start]);
        }
        return groupSum6(start + 1, nums, target - nums[start])
               || groupSum6(start + 1, nums, target);
    }
    //groupNoAdj
    public boolean groupNoAdj(int start, int[] nums, int target){
        if (start >= nums.length){
            return target == 0;
        }
        return groupNoAdj(start + 2, nums, target - nums[start])
               || groupNoAdj(start + 1, nums, target);
    }
    //groupSum5
    public boolean groupSum5(int start, int[] nums, int target){
        if (start >= nums.length){
            return target == 0;
        }
        if (nums[start] % 5 == 0){
            if (start < nums.length - 1 && nums[start + 1] == 1){
                return groupSum5(start + 2, nums, target - nums[start]);
            }
            return groupSum5(start + 1, nums, target - nums[start]);
        }
        return groupSum5(start + 1, nums, target - nums[start])
               || groupSum5(start + 1, nums, target);
    }
    //groupSumClump
    public boolean groupSumClump(int start, int[] nums, int target) {
        if (start >= nums.length){
            return target == 0;
        }
        int sum = nums[start];
        int count = 1;
        for (int i = start + 1; i < nums.length; i++){
            if (nums[i] == nums[start]) {
                sum += nums[i];
                count++;
            }
        }
        return groupSumClump(start + count, nums, target - sum)
               || groupSumClump(start + count, nums, target);
    }
    //splitArray
    public boolean splitArray(int[] nums) {
        return helper(0, nums, 0, 0);
    }
 
    private boolean helper(int start, int[] nums, int sum1, int sum2) {
        if (start >= nums.length){
            return sum1 == sum2;
        }
        return helper(start + 1, nums, sum1 + nums[start], sum2)
               || helper(start + 1, nums, sum1, sum2 + nums[start]);
    }
}
