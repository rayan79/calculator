package calculator;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;
import org.testng.annotations.Test;

public class employeeCalc {

	static String sCustomer;
	static String sProduct;
	static double dProductPrice;
	static int iQuantity;
	static double dTotalPrice;
	static double dDiscount;

	

	public static void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("enter the customer name : ");
		sCustomer = scan.nextLine();
		System.out.print("enter the product name : ");
		sProduct = scan.nextLine();
		System.out.print("enter the price : ");
		dProductPrice = scan.nextDouble();
		System.out.print("enter the quantity  : ");
		iQuantity = scan.nextInt();
		
	}
	public static void math() {
		dTotalPrice=iQuantity*dProductPrice;
		if (dTotalPrice>= 100 && dTotalPrice<200 ) {
			dDiscount=dTotalPrice-10;
		}
		else if (dTotalPrice >=200 && dTotalPrice <300) {
			dDiscount=dTotalPrice-15;
			
		}
		else if (dTotalPrice<100) {
			dDiscount=dTotalPrice;
		}
		else {
			dDiscount=dTotalPrice-20;
			
		}
			
			
	
	}
	public static void output() {
		System.out.println("customer name is "+sCustomer);
		System.out.println("product  name is "+sProduct);
		System.out.println("product price is "+dProductPrice);
		System.out.println("Total Quantity is "+iQuantity);
		System.out.println("total price is "+dTotalPrice);
	System.out.println("Discount price is "+dDiscount);
		
	}
	public static void main(String[] args) {
		
		for (int i =0;i<10;i++) {
		
		input();
		math();
		output();
	}

}
}