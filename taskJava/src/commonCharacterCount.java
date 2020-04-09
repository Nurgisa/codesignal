import java.util.ArrayList;

public class commonCharacterCount {
    public static void main(String[] args) {
        System.out.println("result: " + commonC("aabcc", "adcaa"));
    }
    static int commonC(String s1, String s2){
        String s3 = s2;
        for(int i = 0;i<s1.length();i++){
           s3 = check(s1.substring(i,i+1),s3);
        }
        return s2.length()-s3.length();
    }

    static String check(String x, String y){
        for (int i = 0;i<y.length();i++){
            if(y.substring(i,i+1).equals(x)){
                return y.substring(0,i)+y.substring(i+1);
            }
        }
        return y;
    }
}
