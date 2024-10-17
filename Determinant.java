

public class Determinant {
    
    public static int[][] submatrix(int mat[][], int row, int clm) {
        int size = mat.length - 1;
        int[][] submatrix = new int[size][size];
        int i_ = 0; 
        for (int i = 0; i < mat.length; i++) {
            if (i == row)
            {}
            else{
            int j_ = 0; 
            for (int j = 0; j < mat[0].length; j++) {
                if (j == clm)
                 {} 
                 else{
                submatrix[i_][j_] = mat[i][j];
                j_++;
                 }
            }
            i_++;
        }
        }
        return submatrix;
    }

   
    public static int determinant(int[][] mat) {
        if (mat.length == 2 && mat[0].length == 2) { 
            return mat[0][0] * mat[1][1] - mat[1][0] * mat[0][1];
        }
        int deter = 0;
        int sign = 1;
        for (int i = 0; i < mat[0].length; i++) {
            
            deter += sign * mat[0][i] * determinant(submatrix(mat,0,i));
            sign = -sign;
        }
        return deter;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 2,0,5},{ 4,2,5},{8,9,0} };
        System.out.println("Determinant: " + determinant(matrix)); 
    }
}
