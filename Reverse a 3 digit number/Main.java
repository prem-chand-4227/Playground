import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int rev = 0;
    while(n>0)
    {
      int last_digit = n%10;
      rev = (rev*10)+last_digit;
      n=n/10;
    }
    System.out.println(rev);
    //Type your code here
  }
}