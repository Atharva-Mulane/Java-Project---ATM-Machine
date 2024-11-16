package atm_machine;

import java.util.HashMap;
import java.util.Map.Entry;
import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class OptionMenu extends Account{
	
	int selection;
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
	
	public void getLogin() throws IOException{
		int x = 1;
		
		do{
			try{
				data.put(12345678, 1234);
				data.put(10203040, 0000);
				
				System.out.println("Welcome to the ATM Project!!"+"\n");
				
				System.out.print("Enter your customer number: ");
				setCustomerNumber(menuInput.nextInt());
				
				System.out.println("Enter your Pin Number: ");
				setPinNumber(menuInput.nextInt());		
			}catch(Exception e){
				System.out.println("\n"+"Invalid characters!!");
				x = 2;
			}
			for(Entry<Integer, Integer> entry : data.entrySet()){
				if(entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber()){
					getAccountType();
				}
			}
			System.out.println("\n"+"Wrong customer number or pin");
		}while(x == 1);
	}
	
	public void getAccountType(){
		System.out.println("Select the account you want to access: ");
		System.out.println("Type 1 - Checking Account");
		System.out.println("Type 2 - Saving Account");
		System.out.println("Type 3 - Exit");
		
		System.out.print("Choice: ");
		
		selection = menuInput.nextInt();
		
		switch(selection){
		case 1:
			getChecking();
			break;
		
		case 2:
			getSavingBalance();
			break;
			
		case 3:
			System.out.println("Thank you for using this ATM");
			break;
			
		default:
			System.out.println("Invalidchoice!!");
			getAccountType();
		}		
	}
	public void getChecking(){
		System.out.println("Checking account: ");
		System.out.println("1 - View Balance");
		System.out.println("2 - Withdraw Funds");
		System.out.println("3 - Deposit Funds");
		System.out.println("4 - Exit");
		
		selection = menuInput.nextInt();
		
		switch(selection){
		
		case 1:
			System.out.println("Checking Account balance: "+moneyFormat.format(getCheckingBalance()));
			getAccountType();
			break;
			
		case 2:
			getCheckingWithdrawInput();
			getAccountType();
			break;
			
		case 3:
			getCheckingDepositInput();
			getAccountType();
			break;
			
		case 4:
			System.out.println("Thankkk youuu for Using ATM");
			break;
			
		default:
			System.out.println("\n Invalid Choice!!!");
			getChecking();
		}
		
	}
}
