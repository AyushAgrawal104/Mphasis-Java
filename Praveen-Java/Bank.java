class Bank{

int accountNo=10; // instance variable
static String bankName="ICICI"; // static  property


void f1(){  // non static method

  accountNo=1;
  bankName="SBI";

}

int x=500;


public static void main(String args[]){


   Bank b1; // reference variable
   b1=new Bank();

  Bank b2=new Bank();
  Bank b3=new Bank();

  


  b1.accountNo=1024;
  b2.accountNo=2015;

   int x;
   x=100;
   b1.x=200;
   b2.x=300;

  


  System.out.println("B1 Bank Name: "+bankName);
  System.out.println("B2 Bank Name: "+bankName);
  System.out.println("B1 Account No: "+b1.accountNo);
  System.out.println("B2 Account No: "+b2.accountNo);


 System.out.println("Account Type "+Account.accType);

  Account.test();








}


}