import java.util.ArrayList;
import java.util.List;

public class GreatestCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        System.out.println(kidsWithCandies(candies, 3));
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        List<Boolean> arrayList = new ArrayList<>();
        int max = -2147483648;
        for(int i = 0;i< candies.length; i++){
            if(candies[i]>max)
                max = candies[i];
        }
        for(int x : candies){
            if(x+extraCandies >= max)
                arrayList.add(true);
            else
                arrayList.add(false);
        }
        return arrayList;
    }
}
