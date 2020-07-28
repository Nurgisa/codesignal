public class SmallerThanCurrent {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        nums = smallerNumbersThanCurrent(nums);
        for(int x : nums){
            System.out.println(x);
        }
    }


    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] output = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int cnt = 0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                   cnt+=1;
                }
            }
            output[i]=cnt;
        }
        return output;
    }
}
