public class Punto2_1 {
    public int countEvens(int[] nums) {
        int cont = 0;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] % 2 == 0) cont++;
        return cont;
    }
    public int bigDiff(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max){
                max = nums[i];
            }  
            if (nums[i] <= min){
                min = nums[i];
            }
        }
        return max - min;
    }
    public int centeredAverage(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (nums[i] > max){
                max = nums[i];
            }
            if (nums[i] < min){
                min = nums[i];
            }
        }
        return (sum - (max + min)) / (nums.length - 2);
    }
    public int sum13(int[] nums) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 13){
                total += nums[i];
            } else if (i <= nums.length - 1){
                i++;
            }
        }
        return total;
    }
    public int sum67(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 6){
                sum += nums[i];
            } else {
                while (nums[i] != 7) i++;
              }
        }
        return sum;
    }
}
