public class ShuffleArray {
    public static void main(String[] args) {
        int[] nums = {1};
        shuffle(nums, 1);

    }

    static int[] shuffle(int[] nums, int n){
        int [] output = new int[nums.length];
        output[0] = nums[0];
        int x = 2;
        int y = 2;
        for(int i = 0;i<nums.length;i++){
            if(i<n && i!=0){
                output[x*2-2]=nums[i];
                x++;
            }
            else if(i>=n && i!=0){
                output[y*2-3]=nums[i];
                y++;
            }
        }
        return output;
    }
}
