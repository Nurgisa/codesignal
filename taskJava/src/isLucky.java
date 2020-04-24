public class isLucky {
    public static void main(String[] args) {
        System.out.println(isLucky(11));
    }

    static boolean isLucky(int n) {
        int x = n; int cnt = 1;
        while (x > 9){
            x/=10;
            cnt+=1;
        }
        x = n;int i = 1;int r = 0;int l = 0;
        while (x > 0){
            if(i<=cnt/2){
                r+=x%10;
            }
            else{
                l+=x%10;
            }
            x/=10;
            i+=1;
        }
        if(r==l)
            return true;
        else
            return false;
    }

}
