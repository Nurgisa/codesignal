public class Polyndrome {
    public static void main(String[] args) {

        System.out.println(reverse(121));
    }

    static boolean reverse(int x) {int y = 0;int cnt = 0;
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            rev = rev * 10 + pop;
        }
        return rev==x;

    }
}
