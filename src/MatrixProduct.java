import java.util.Scanner;

public class MatrixProduct {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int r= scanner.nextInt();
        int c= scanner.nextInt();
        int[][] array=new int[r][c];
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                array[i][j]= scanner.nextInt();
            }
        }
        int b= scanner.nextInt();
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                array[i][j]*=b;
            }
        }
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
