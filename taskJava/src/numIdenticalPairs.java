public class numIdenticalPairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(execute(nums));
    }

    static int execute(int [] nums){
        int output = 0;
        for(int i = 0;i<nums.length;i++){
            for(int j = i;j<nums.length;j++){
                if(nums[i]==nums[j] && i<j){
                    output+=1;
                }
            }
        }
        return output;
    }
}
