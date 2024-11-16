package atm_machine;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	public int setCustomerNumber(int customerNumber){
		this.customerNumber = customerNumber;
		return customerNumber;
	}
	
	public int getCustomerNumber(){
		return customerNumber;
	}
	
	public int setPinNumber(int pinNumber){
		this.pinNumber = pinNumber;
		return pinNumber;
	}
	
	public double getCheckingBalance(){
		return checkingBalance;
	}
	
	public double getSavigBalance(){
		return savingBalance;
	}
	
	public double calcCheckingWithdraw(double amount){
		checkingBalance = (checkingBalance - amount);
		return checkingBalance;
	}
	
	public double calcSavingWithdraw(double amount){
		savingBaalance = (savingBalance - amount);
		return savingBalance;
	}
	
	public void getCheckingWithdrawInput(){
		System.out.println("Checking account balance: "+moneyFormat.format(checkingBalance));
		System.out.print("Amount you want to withdraw from Account: ");
		double amount = input.nextDouble();
		
		if((checkingBalance - amount) >= 0{
			calcCheckingWithdraw(amount);
			System.out.println("New Checking Account balance: "+moneyFormat.format(checkingBalance));
		}else{
			System.out.println("Balance cannot be negative "+"\n");
		}
	}
	
	public void getCheckingDepositInput(){
		System.out.println("Checking account balance: "+moneyFormat.format(checkingBalance));
		System.out.print("Amount you want to withdraw from Account: ");
		double amount = input.nextDouble();
		
		if((checkingBalance - amount) >= 0){
			calcCheckingWithdraw(amount);
			System.out.println("New Checking Account balance: "+moneyFormat.format(checkingBalance));
		}else{
			System.out.println("Balance cannot be negative "+"\n");
		}
	}
	
	
}
