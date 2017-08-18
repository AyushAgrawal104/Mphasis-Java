class Product{

static String storeName="HYD Store";
int prodId;
String prodName;
double price;

void setData(int prodId,String prodName,double price){
this.prodId=prodId;
this.prodName=prodName;
this.price=price;
}

void display(){
System.out.println("Store Name: "+storeName);
System.out.println("Product Id: "+prodId);
System.out.println("product Name: "+prodName);
System.out.println("Price: "+price);
}



}