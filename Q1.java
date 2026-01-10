import java.util.Scanner;
public class Q1 {   
    public static void main(String args[]) {
           Scanner sc = new Scanner (System.in);

           System.out.println(" Enter total obtained marks:" );
           double obtmarks = sc.nextInt();
           System.out.println(" Enter total max marks:" );
           double maxmarks = sc.nextInt();
           double percentage = 
           (obtmarks / maxmarks) * 100;
           System.out.println("This is your percentage");
           System.out.println(percentage);
           sc.close();


           


    }
}
