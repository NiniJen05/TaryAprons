// Designed by J.R. Amezcua 07/10/2017 
//This program tells me the amount of tax I should be charging, plus total sale
import java.util.Scanner;

public class SalesTax { 
 	public static void main(String[] args) {
 	Scanner input = new Scanner(System.in);
 	
 	System.out.print("Enter purchase amount: ");
 	double purchaseAmount = input.nextDouble();

 	double tax = purchaseAmount * 0.0925;
 	double totalSale = (purchaseAmount + tax); 

 	System.out.println("Sales tax is " + (int)(tax * 100)/ 100.0 + " Sales Total: " + (int)(totalSale * 100) / 100.0);
	
 	}
 }
