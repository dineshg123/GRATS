import java.util.*;
class AccountManagement
{
	String sourceName, sourceBankName, benName, benBankName;
	int benAccountNumber, sourceAccountNumber;
	float sourceBalance, benBalance, transferAmt;
	Scanner s = new Scanner(System.in);
	public void SourceAccountDetails()
	{
	
		System.out.println("*********************************Please Enter Source Account Details***************************************");	
		System.out.println("Enter Account Holder Name:");
		sourceName = s.next();
		System.out.println(" Enter your Account Number:");
		sourceAccountNumber = s.nextInt();
		System.out.println("Enter your Bank Name:");
		sourceBankName = s.next();
		System.out.println("Enter your Account Balance Amonut in INR:");
		sourceBalance = s.nextFloat();
		System.out.println("Enter Amount to transfer in INR:");
		transferAmt = s.nextFloat();
		
	}
	public void BeneficiaryAccountDetails()
	{
	
		System.out.println("*********************************Please Enter Beneficiary Account Details**********************************");	
		System.out.println("Enter Account Holder Name:");
		benName = s.next();
		System.out.println(" Enter your Account Number:");
		benAccountNumber = s.nextInt();
		System.out.println("Enter your Bank Name:");
		benBankName = s.next();
		System.out.println("Enter your Account Balance Amonut in INR:");
		benBalance = s.nextFloat();
		
		
	}
	public void TransactionDetails()
	{
		
		sourceBalance = sourceBalance - transferAmt;
		benBalance = benBalance + transferAmt;
    }
	
	
	public void DisplaySourceAccountDetails()
	{
			System.out.println("*****************The Source Account Transanction Details********************************************");
			System.out.println("The Account Holder Name:"+sourceName);
			System.out.println("The Account Bank Name:"+sourceBankName);
			System.out.println("The Account Number:"+sourceAccountNumber);
			System.out.println("The Account Balance:"+(sourceBalance));
			System.out.println("*****************************************************************************************************");
	}
	public void DisplayBeneficiaryAccountDetails()
	{
			System.out.println("*****************The Benificiary Account Transaction Details*****************************************");
			System.out.println("The Account Holder Name:"+benName);
			System.out.println("The Account Bank Name:"+benBankName);
			System.out.println("The Account Number:"+benAccountNumber);
			System.out.println("The Account Balance:"+(benBalance));
			System.out.println("******************************************************************************************************");
	}
	

	public static void main(String args[])
	{
		AccountManagement ac = new AccountManagement();
		ac.SourceAccountDetails();
		ac.BeneficiaryAccountDetails();
		ac. TransactionDetails();
		ac.DisplaySourceAccountDetails();
		ac.DisplayBeneficiaryAccountDetails();
	}
}
	
			
			
		
		
	