import java.util.ArrayList;
import java.util.StringTokenizer;

public class NQueens {
    public static void main(String[] args) {
        solveNQueens(2);
    }

    static void solveNQueens(int n){
        int checkmat[][] = new int [n][n];
        int quenes[] = {1,2};
        ArrayList<String> solutions = new ArrayList<String>();
        ArrayList<ArrayList<String>> matrix = new ArrayList<ArrayList<String>>();
        boolean koiyldy[] = new boolean[n];

        for(int x : quenes){
            solutions = new ArrayList<String>();
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                }
            }
            matrix.add(solutions);
        }


        for(int x = 0;x<matrix.size();x++){
            for(int y = 0;y<matrix.get(x).size();y++){
                System.out.println("SOLUTION NUMBER #" + (y+1));
                checkmat = new int [n][n];
                StringTokenizer tokenr = new StringTokenizer(matrix.get(x).get(y), ";");
                checkmat[Integer.parseInt(tokenr.nextToken())][Integer.parseInt(tokenr.nextToken())]=quenes[x];
                printM(n, checkmat);
            }
        }
        //printSol(solutions);
        /*
        for(int x = 0;x<quenes.length;x++){
            for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(!koiyldy[x] && checkmat[i][j]==0){
                    checkmat[i][j] = quenes[x];
                    koiyldy[x] = true;
                }
            }
            }
        }*/
        //printM(n, checkmat);
    }
    static void printM(int n, int[][] checkmat){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(checkmat[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("----  --------   -------");
    }

    static void printSol(ArrayList<String> solutions){
        for(String x : solutions)
            System.out.println(x);
    }
}
