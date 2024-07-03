class TwoPointers {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,11,13,14};
        int target = 9;
        
        int[] result = findTwoNumbers(nums, target);
        
        if (result.length == 2) {
            System.out.println("Two numbers found: " + result[0] + ", " + result[1]);
        }
        else {
            System.out.println("No pair of numbers were found.");
        }
    }
    
    public static int[] findTwoNumbers(int[] nums, int target) {
        int leftPtr = 0;
        int rightPtr = nums.length - 1;
        
        while (leftPtr < rightPtr) {
            int sum = nums[leftPtr] + nums[rightPtr];
            if (sum == target) {
                return new int[] {nums[leftPtr], nums[rightPtr]};
            }
            else if (sum < target) {
                leftPtr++;
            }
            else {
                rightPtr--;
            }
        }
        return new int[0];
    }
    
}
