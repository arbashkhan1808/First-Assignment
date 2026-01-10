import java.util.Scanner;
public class Q2 {
public static void main (String args[]) {
           Scanner sc = new Scanner (System.in);
        System.out.println("Enter Radius");
        double Rad = sc.nextInt ();
        double Area = ( Math.PI*Math.pow(Rad,2));
        System.out.println("This is your Area" );
        System.out.println(Area);
        double Circumferrence = (2*Math.PI*Rad);
        System.out.println("This is your Circumferrence");
        System.out.println(Circumferrence);
        sc.close();



}


}