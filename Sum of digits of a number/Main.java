import java.util.Scanner;
class Main {
	public static void main (String[] args){
	 Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int sum=0;
      int l;
      while(n>=10)
      {
        l=n%10;
        sum=sum+l;
        n=n/10;
      }
      sum=sum+n;
      System.out.println(sum);
      // Type your code here
	}
      
}