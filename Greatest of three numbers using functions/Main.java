import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner s = new Scanner(System.in);
      int n1= s.nextInt();
      int n2=s.nextInt();
      int n3=s.nextInt();
      if(n1>n2 && n1>n3)System.out.print(n1);
      else if(n2>n1&&n2>n3) System.out.print(n2);
      else if (n3>n1 && n3>n2) System.out.println(n3);
      // Type your code here
	}
}