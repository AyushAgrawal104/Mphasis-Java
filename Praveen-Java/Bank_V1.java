
class Bank_V1{

String custName;
String accType="Current";
int accountNo=10; // instance variable
static String bankName="ICICI"; // static  property


void display(){  // non static method
  System.out.println("Bank Name: "+bankName);
  System.out.println("Cust Name: "+custName);
  System.out.println("B2 Account No: "+accountNo);
  System.out.println("----------------------------");
}

static void test(){
System.out.println("Bank class test method");
}

public static void main(String args[]){


   Bank_V1 b1; // reference variable
   b1=new Bank_V1();

  Bank_V1 b2=new Bank_V1();
  Bank_V1 b3=new Bank_V1();

  


  b1.accountNo=1024;
  b1.custName="Praveen";
  b2.accountNo=1025;
  b2.custName="Bucky Wall";
  b3.accountNo=1026;
  b3.custName="Ozvitha";

  b1.display();
  b2.display();
  b3.display();


  Account acc=new Account();
  System.out.println("Account Class: "+acc.accType);
  System.out.println("Bank Class: "+b1.accType);
 
 Account.test();
 test();

}


}