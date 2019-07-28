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
    for(int i = row_size-1; i  >=0; i--){
      for(int j = 0; j <=column_size-1; j++)
      {
        System.out.print(matrix[j][i]+" ");}
      System.out.println();
    }
  }
}
