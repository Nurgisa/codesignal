import java.util.ArrayList;
import java.util.List;

public class longestString {
    public static void main(String[] args) {
        String [] inputArray = new String[]{"a", "aa", "ad", "vcd", "aba", "dsadqw"};
        allLongestStrings(inputArray);
    }

    static String [] allLongestStrings(String[] inputArray) {
        List<String> myList = new ArrayList<String>();
        for (int i = 0;i<inputArray.length;i++){
            if(myList.size()==0){
                myList.add(inputArray[i]);
            }
            else{
                if(myList.get(0).length()==inputArray[i].length()){
                    myList.add(inputArray[i]);
                }
                else if(myList.get(0).length()<inputArray[i].length()){
                    myList.clear();
                    myList.add(inputArray[i]);
                }
            }
        }
        String [] output = myList.toArray(new String[myList.size()]);

        return output;
    }
}
