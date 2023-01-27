import java.util.Scanner;

public class SimpleBillingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price,tax,amount;
        System.out.print("Enter the price of the item: ");
        price = sc.nextDouble();
        System.out.print("Enter the tax percentage: ");
        tax = sc.nextDouble();
        tax = (tax/100)*price;
        amount = price + tax;
        System.out.println("Price: " + price);
        System.out.println("Tax: " + tax);
        System.out.println("Total: " + amount);
    }
}