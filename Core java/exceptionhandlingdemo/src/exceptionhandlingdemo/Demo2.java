package exceptionhandlingdemo;

import java.util.Comparator;
import java.util.Scanner;

public class Demo2{
	public static void main(String[] args) throws InvalidAadharNumberException{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Account no: ");
		Integer accountNumber = s.nextInt();
		if(accountNumber==null || accountNumber==0) {
			throw new InvalidAccountNumberException("accountno should not be zero");
		}else {
			System.out.println("Your account no is: "+accountNumber);
		}
		System.out.println("Enter Aadhar card no");
		int aadhar=s.nextInt();
		String saadhar = String.valueOf(aadhar);
		if(saadhar.length()!=8) {
			throw new InvalidAadharNumberException("length should be 8");
		}
	}

	


}
