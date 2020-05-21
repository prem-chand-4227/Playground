import java.util.Scanner;
public class Main{
  public static int gcd(int a,int b)
  {
    if(b==0)
       return a;
    else return gcd(b,a%b);
  }
  public static int gcd(int a,int b,int c)
  {
    return gcd(gcd(a,b),c);
  }
	public static void main (String[] args)
	{
      Scanner s = new Scanner(System.in);
      int n1= s.nextInt();
      int n2 = s.nextInt();
      int n3 = s.nextInt();
      int GCDofnumbers = Main.gcd(n1,n2,n3);
      System.out.println(GCDofnumbers);
	    // Type your code here
	}
}