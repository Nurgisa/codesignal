public class Factorial {
    public static void main(String[] args) {
        System.out.println(perfectNumber(28));
    }


    static boolean perfectNumber(int n) {
        int sum = -1;
        for(int i = 1;i<n;i++){
            if(n%i==0)
                sum+=i;
        }
        return sum==n;
    }
}
