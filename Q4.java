import java.util.Scanner;
public class Q4 {
public static void main (String args[]) 
{
           Scanner sc = new 
           Scanner (System.in);
           System.out.println("Enter Discounted Selling Price: ");
           double DiscountedPrice = sc.nextDouble();
           System.out.println("Enter Discount Percentage:");
           double DiscountPercent = sc.nextDouble();
           double OriginalPrice = (DiscountedPrice *100) / (100 - DiscountPercent);
           System.out.println("Original Selling Price =" + OriginalPrice );
           sc.close();
}

}


 