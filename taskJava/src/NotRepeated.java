import java.util.ArrayList;

public class NotRepeated {
    public static void main(String[] args) {
        int a[] = new int[]{4,1,2,1,2};
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0;i<a.length;i++){
            if(arrayList.indexOf(a[i])==-1)
                arrayList.add(a[i]);
            else
                arrayList.remove(arrayList.indexOf(a[i]));
        }
        System.out.println(arrayList.size());
    }
}
