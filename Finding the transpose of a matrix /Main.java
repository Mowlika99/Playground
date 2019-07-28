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
    int matrix1[][] = new int[column_size][row_size];
    for(int i = 0; i <= row_size - 1; i++){
      for(int j = 0; j <= column_size - 1; j++)
      {
        matrix1[j][i]=matrix[i][j];
      }
    }
    for(int i = 0; i <= column_size - 1; i++){
     for(int j = 0; j <= row_size - 1; j++)
      {
     System.out.print(matrix1[i][j] + " ");
      }
      System.out.println();
    }
  }
}
