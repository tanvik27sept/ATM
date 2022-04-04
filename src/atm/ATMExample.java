package atm;
import java.util.Scanner;

public class ATMExample 
{
	public static void main(String[] args) 
	{
		//comment on 4th april
		int balance =100000,withdraw,deposit;
		Scanner sc= new Scanner(System.in);
		while(true)
		{
			System.out.println("Automated Teller Machine");
			System.out.println("Choose 1 for withdraw");
			System.out.println("choose 2 for deposit");
			System.out.println("choose 3 for check balance");
			System.out.println("choose 4 for exit");
			System.out.println("choose the operation you want to perform");
			
			int choice =sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter money to be withdraw");
				withdraw=sc.nextInt();
				if(balance>=withdraw) 
				{
					balance=balance-withdraw;
					System.out.println("please collect your money");
				}
				else
				{
					System.out.println("insufficient Balance");
				}
				System.out.println("");
				break;
			case 2:
				System.out.println("Enter money to be deposited");
				deposit=sc.nextInt();
				balance=balance+deposit;
				System.out.println("your money has been succesfully deposited");
				System.out.println("");
				break;
			case 3:
				System.out.println("balance:"+balance);
				System.out.println("");
				break;
			case 4:
				System.exit(0);
			}
		}

	}

}
