import java.util.Scanner;
public class Q3 {
public static void main (String args[]) {
          
          
           Scanner sc = new 
           Scanner (System.in);
           System.out.println("Enter Original Selling Price");
           double OriginalPrice = sc.nextDouble();
           System.out.println("Enter Discount Percentage:");
           double DiscountPercent = sc.nextDouble();
           double DiscountAmount = 
           (OriginalPrice * DiscountPercent) / 100;
           double DiscountedPrice =
           OriginalPrice - DiscountAmount;
           System.out.println("\nDiscountAmount =" + DiscountAmount);
           System.out.println("Discounted Selling Price =" + DiscountedPrice);
           sc.close();
          }
}


