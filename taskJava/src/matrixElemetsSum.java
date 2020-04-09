import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class matrixElemetsSum {
    public static void main(String[] args) {
        int matrix[][] = {{0,1,1,2}, {0,5,0,0},{2,0,3,3}};
        matrixE(matrix);
    }

    static int matrixE(int[][] matrix) {
        HashSet<Integer> hashSet = new HashSet<>();
        Boolean check = true;
        Iterator<Integer> k;
        int sum = 0;
        for (int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[i].length;j++){
                check = true;
                if(matrix[i][j]==0){
                    hashSet.add(j);
                }
                k = hashSet.iterator();
                while (k.hasNext()) {
                    if (j == k.next()) {
                        check = false;
                    }
                }
                if(check){
                    sum +=matrix[i][j];
                }
            }
        }
        System.out.println("sum " + sum);
        return sum;
    }

}
