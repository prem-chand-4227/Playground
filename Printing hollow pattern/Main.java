import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      for(int row = 1;row<=n;row++)
      {
        for(int col =1;col<=n;col++)
        {
          if(row==1 || row==n || col==n|| col==1)
            System.out.print("*");
          else System.out.print(" ");
                             
        }
        System.out.println();
      }
      // Type your code here
	}
}