import java.lang.Math;
import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int b = s.nextInt();
    int e = s.nextInt();
    double p = Math.pow(b,e);
    System.out.println(p);
  }
}