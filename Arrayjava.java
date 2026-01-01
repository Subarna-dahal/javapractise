public class Arrayjava {
    public static void main(String[] args) {
        int[][] matrix={{2, 4, 6},
                {8, 10, 12},
                {1, 2, 4}
        };
        int rows=matrix.length;
        int colums=matrix[0].length;

        int[] rowSum=new int[rows];
        int[] colSum=new int[colums];
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                    rowSum[i]+=matrix[i][j];
                    colSum[j]+=matrix[i][j];
            }
        }
        System.out.println("Sum of each rows");
        for(int i=0;i<rows;i++){
            System.out.println("Rows"+(i+1)+":"+rowSum[i]);
        }
        System.out.println("Sum of each Columns");
        for (int j=0;j<colums;j++){
            System.out.println("Cols"+(j+1)+":"+colSum[j]);
        }
    }
}
