import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      //int count =0;
      for(int i=1;i<=n;i++)
      {
        int count=0;
        for(int num=i;num>=1;num--)
        {
          if(i%num==0)
            count = count +1;
        }
      
      if(count ==2 )
        System.out.println(i);
      }// Type your code here
	}
}