import java.util.Scanner;
class Main {
	public static void main (String[] args){
	  Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int fd,ld;
      fd=n;
      while(fd>=10)
      {
        fd=fd/10;
      }
      ld=n%10;
      System.out.println(fd+ld);
      // Type your code here
	}
}