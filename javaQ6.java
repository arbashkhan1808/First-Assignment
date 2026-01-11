import java.util.Scanner;
 public class javaQ6 {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of first parallel side: ");
        double a = sc.nextDouble();
        System.out.println("Enter length of second parallel side: ");
        double b = sc.nextDouble();
        System.out.println("Enter perpendicular distance (height): ");
        double h = sc.nextDouble();
        double area = 0.5 * (a + b) * h ;
        System.out.println("Area of the trapezoid =" + area);
        sc.close();
     }
 }
    



   