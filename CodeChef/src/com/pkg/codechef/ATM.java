package com.pkg.codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Transaction{
	
	public void transaction(double amount, double balance)
	{
		double interest = 0.50;
		if(amount+interest<=balance && amount%5==0)
		{
			
			
				amount += interest;
				double d = balance-amount;
				System.out.println(d);
		}
		else if(amount>balance){
			System.out.println("Insufficient balance: "+balance);
			
		}
		else{
			System.out.println("Incorrect amount: "+balance);
		}
	}
}

 public class ATM {
	public static void main(String[] args)throws Exception
	{
		 Transaction trn = new Transaction();
		double balance;
		int amount;
	//	System.out.println("Enter amount you want to withdrawl: " +"Main Balance is: "+balance);
//		Scanner scan = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		amount = Integer.parseInt(arr[0]);
		balance = Double.parseDouble(arr[1]);
		
//		amount = Integer.parseInt(br.readLine());
//		balance = Double.parseDouble(br.readLine());
		
		 trn.transaction(amount, balance);
	}

}
