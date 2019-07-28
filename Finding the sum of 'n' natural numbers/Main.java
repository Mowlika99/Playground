import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
		Scanner in = new Scanner(System.in);
        int num = in.nextInt();
      int s=sum(num);
      	System.out.println(s);
    }
    public static int sum(int num)
    {
      if(num > 0)
      return num + sum(num - 1);
      else
      return 0;
    }
}
