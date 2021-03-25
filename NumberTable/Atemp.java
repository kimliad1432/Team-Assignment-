import java.util.Scanner;
public class Atemp
{
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int height = scan.nextInt();
       int width = scan.nextInt();
      
       Table1 atemp = new Table1();
       atemp.getNumber(height, width);
    }
}
