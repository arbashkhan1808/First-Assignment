import java.util.Scanner;
 public class javaQ5 {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Voltage (in Volts): ");
        double volt = sc.nextDouble();

        System.out.print("Enter Current (in Amperes): ");
        double curr = sc.nextDouble();

        double power = volt * curr;

        System.out.println("Power = " + power + " Watts");

        sc.close();
    }
}