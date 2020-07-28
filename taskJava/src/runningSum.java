public class runningSum {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        nums = fsum(nums);
        for(int x : nums){
            System.out.println(x);
        }
    }

    static int[] fsum(int[] nums){
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum+=nums[i];
            nums[i]=sum;
        }
        return nums;
    }
}
