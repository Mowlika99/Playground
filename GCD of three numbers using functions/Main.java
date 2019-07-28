import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	   Scanner in=new Scanner(System.in);
int n1=in.nextInt();
 int n2=in.nextInt();
      int n3=in.nextInt();
int result=gcdd(n1,n2);
      System.out.println(gcdd(n1,n2));
	} 
  public static int gcdd(int i,int j){
    int min;
    if(i<j){
      min=i;}
    else{
      min=j;}
    while(min>=1){
      if((i%min==0)&&
         (j%min==0)){
        return min;}
      
        --min;}
return 0;
         }
    }