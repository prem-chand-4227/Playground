import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int p=1;
      for(int i=1;i<=n;i++)
      {
        p=i*p;
        
      }
      System.out.println(p);
      // Type your code here
	}
}