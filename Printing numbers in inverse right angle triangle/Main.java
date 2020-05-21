import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int num=n;
      for(int row=1;row<=n;row++)
      {
        for(int col=num;col>=1;col--)
        {
          System.out.print(col);
        }
        System.out.println();
        num = num-1;
      }
      // Type your code here
	}
}