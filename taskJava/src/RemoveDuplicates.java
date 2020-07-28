public class RemoveDuplicates {
    public static void main(String[] args) {
        int [] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }

    static int removeDuplicates(int[] nums){
        int prev = -2147483648;
        int cnt = 0;
        for(int x : nums){
            System.out.println(x);
        }
        return cnt;
    }
}
