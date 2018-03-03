public class Punto2_2 {
    public int maxSpan(int[] nums) {
        if (nums.length > 0) {
            int maxSpan = 1;
            for (int i = 0; i < nums.length; i++){
                for (int j = nums.length - 1; j > i; j--){
                    if (nums[j] == nums[i]) {
                        int count = (j - i) + 1;
                        if (count > maxSpan){
                            maxSpan = count;
                        }
                    break;
                    }
                }
            }
            return maxSpan;
        } else {
            return 0;
        }
    }
    public int[] fix34(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 3) {
                int temp = nums[i + 1];
                nums[i + 1] = 4;
                for (int j = i + 2; j < nums.length; j++){
                    if (nums[j] == 4){
                        nums[j] = temp;
                    }
                }
            }
        }
        return nums;
    }
    public int[] fix45(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 5 && i == 0 || nums[i] == 5 && nums[i - 1] != 4) {
                int pos5 = i;
                for (int j = 0; j < nums.length; j++){
                    if (nums[j] == 4 && nums[j + 1] != 5) {
                        int temp = nums[j + 1];
                        nums[j + 1] = 5;
                        nums[pos5] = temp;
                    break;
                    }
                }
            }
        }
        return nums;
    }
    public boolean canBalance(int[] nums) {
        for (int i = 0; i < nums.length; i++) { 
            int sum = 0;
            for (int j = 0; j < i; j++) sum += nums[j];
            for (int j = i; j < nums.length; j++) sum -= nums[j];
                if (sum == 0){
                    return true;
                }
        }
        return false;
    }
    public boolean linearIn(int[] outer, int[] inner) {
        int indexInner = 0;
        int indexOuter = 0;
        while (indexInner < inner.length && indexOuter < outer.length) {
            if (outer[indexOuter] == inner[indexInner]) {
                indexOuter++;
                indexInner++;
            } else {
                indexOuter++;
            }
        }
        return (indexInner == inner.length);
    }
}

