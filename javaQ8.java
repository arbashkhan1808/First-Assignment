import java.util.Scanner;
 public class javaQ8 {

 
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first side: ");
        double a = sc.nextDouble();
        System.out.println("Enter second side: ");
        double b = sc.nextDouble();
        System.out.println("Enter third  side: ");
        double c = sc.nextDouble();
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
        System.out.println("Area of the Triangle = " + area);
        sc.close();
     }
 }