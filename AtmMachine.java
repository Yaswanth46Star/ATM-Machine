import java.util.*;

class AtmMachine
{
	public static void main(String arg[])
	{
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the Account number: ");
		int Account = obj.nextInt();
		System.out.print("Enter the Password: ");
		int Password = obj.nextInt();
		double take,withdraw,password,account;
		double Balance = 0;
		account = 123456789;
		password = 8762;
		if(Account == account && Password==password)
		{
			int choice;
			do
			{
				System.out.print("\nChoice the options from the below \n\n\t1.Account Balance\n\t2.Deposite\n\t3.Account type\n\t4.Withdraw\n\t5.Exit\n\nEnter the choice: ");
				choice = obj.nextInt();
				switch(choice)
				{
				case 1:
				
					System.out.println("\n\tAvailable Balance = "+Balance);
					break;
				
				case 2:
				
					System.out.print("\nEnter how much money you would like to Deposite: ");
					take = obj.nextDouble();
					Balance = Balance + take;
					break;
				
				case 3:
				
					System.out.println("\n\tSavings account");
					break;
				
				case 4:
					
					System.out.print("\nEnter how much money would you like to withdraw: ");
					withdraw = obj.nextDouble();
					if(withdraw<=Balance)
					{	
						Balance = Balance - withdraw;
						break;
					}
					else
					{
						System.out.println("\nYou cannot withdraw more than your Balance amount");
						break;
					}
				
				case 5:
					
						System.out.println("\n-----------------------------------------\n|\tThis code has be terminated|\n|\n|\tThanks for using this ATM Machine |\n|\n|\tCreated by: Yaswanth Reddy\t  |\n|-----------------------------------------|\n");
						break;
				}
			}while(choice!=5);

		}
		else
			System.out.println("Entered details are incorrect");

	}
}
