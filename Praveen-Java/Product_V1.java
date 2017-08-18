class Product_V1{

static String storeName="HYD Store";
int prodId;
String prodName;
double price;

void setData(int prodId,String prodName,double price){
this.prodId=prodId;
this.prodName=prodName;
this.price=price;
}

static void display(Product_V1 prod){
System.out.println("Store Name: "+storeName);
System.out.println("Product Id: "+prod.prodId);
System.out.println("product Name: "+prod.prodName);
System.out.println("Price: "+prod.price);
}



}