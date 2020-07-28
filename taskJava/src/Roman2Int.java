import java.util.HashMap;
import java.util.Map;

public class Roman2Int {
    public static void main(String[] args) {
        romainToInt("LXIV");
    }

    static int romainToInt(String s){
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("I",1);
        map.put("V", 5);
        map.put("X",10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        int sum = 0;int prev = 0;int minus = 0;boolean sh = false;
        for(int i = 0;i<s.length()-1;i++){
            sum+=map.get(s.substring(i,i+1));
            if(map.get(s.substring(i,i+1))<map.get(s.substring(i+1,i+2))){
                sum-=map.get(s.substring(i,i+1))*2;
            }
        }
        sum+=map.get(s.substring(s.length()-1));
        return sum;
    }
}
