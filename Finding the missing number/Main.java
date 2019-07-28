import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=in.nextInt();}
      int m_val=0;
      for(int val=1;val<=n;val++){
        boolean missing=false;
        for(int i=0;i<n;i++){
          if(arr[i]== val){missing=true;
                           break;}}
        if(missing==false){
          m_val=val;break;}
      }
          System.out.println(m_val);
    }
}