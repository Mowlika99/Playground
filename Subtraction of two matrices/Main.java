import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    Scanner sc = new Scanner(System.in);
    int row_size = sc.nextInt();
    int column_size = sc.nextInt();
    int matrix[][] = new int[row_size][column_size];
    for(int i = 0; i <= row_size - 1; i++){
      for(int j = 0; j <= column_size - 1; j++)
      {
        matrix[i][j] = sc.nextInt();
      }
    }
     int matrix1[][] = new int[row_size][column_size];
    for(int i = 0; i <= row_size - 1; i++){
      for(int j = 0; j <= column_size - 1; j++)
      {
        matrix1[i][j] = sc.nextInt();
      }
    }
int matrixx[][]=new int[row_size][column_size];
    diff_of_the_matrix(matrix,matrix1,matrixx);
    display(matrixx);
  }
  public static void diff_of_the_matrix(int matrix[][],int matrix1[][],int matrixx[][]){
    for(int i = 0; i <= matrix.length - 1; i++){
      for(int j = 0; j <= matrix[i].length - 1; j++)
      {
        matrixx[i][j]=matrix[i][j]-matrix1[i][j];
      }
    }
  }
   public static void display(int matrix[][]){
     for(int i = 0; i <= matrix.length - 1; i++){
      for(int j = 0; j <= matrix[i].length - 1; j++)
      {
    System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}
