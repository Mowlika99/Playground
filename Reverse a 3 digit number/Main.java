import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in= new Scanner(System .in);
    int n=in.nextInt();
    int n1=n/100;
    int n2=n/10;
      int n3=n2%10;
    int n4=n%10;
    int reverse=(n4*100)+(n3*10)+(n1);
    System.out.println(reverse);
  }
}